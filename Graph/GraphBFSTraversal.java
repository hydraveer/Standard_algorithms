import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class GraphBFSTraversal {
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
    public static void bsf(ArrayList<Edge>[] graph, int i, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(!q.isEmpty()) {
            int e = q.poll();

            if(!visited[e]) {
                visited[e] = true;
                System.out.print(e+" ");
                for(int j=0; j<graph[e].size(); j++) {
                    q.add(graph[e].get(j).dest);
                }
            }
        }
    }
}
