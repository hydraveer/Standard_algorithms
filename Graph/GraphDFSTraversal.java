import java.util.ArrayList;


public class GraphDFSTraversal {
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
    public static void dfs(ArrayList<Edge>[] graph, int i, boolean[] visited) {
        if(visited[i]) return;

        visited[i] = true;
        System.out.print(i+" ");
        for(int j =0; j<graph[i].size(); j++) {
            dfs(graph, graph[i].get(j).dest, visited);
        }
    }

}
