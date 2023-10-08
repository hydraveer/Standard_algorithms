import java.util.ArrayList;

public class FindAllPaths {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void findAllPath(ArrayList<Edge>[] graph, boolean[] visited, int curr, int tar, String ans) {
        if(curr == tar) {
            ans += tar;
            System.out.println(ans);
            return;
        }
        if(!visited[curr]) {
            visited[curr] = true;
            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                findAllPath(graph, visited, e.dest, tar, ans+ Integer.toString(curr));

            }
            visited[curr]= false;
        }
    }
}
