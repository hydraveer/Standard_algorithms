//Time Complexity: O(VE)
import java.util.ArrayList;

public class BellmanFordAlgo {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }
    private static void createAGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -10));

    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int[] ans = new int[V];
        for(int i=0; i<V; i++) {
            if(src != i) ans[i] = Integer.MAX_VALUE;
        }
        for(int k=0; k<V-1; k++) {
            for(int i=0; i<V; i++) {
                for(int j=0; j<graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v= e.dest;

                    if(ans[u] != Integer.MAX_VALUE && (ans[u] + e.weight < ans[v])) ans[v] = ans[u] + e.weight;
                }
            }
        }

        for(int i=0; i<V; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.src;
                int v= e.dest;

                if(ans[u] != Integer.MAX_VALUE && (ans[u] + e.weight < ans[v])) System.out.println("Negative weight cycle occurs!!!");
            }
        }

        for(int i: ans) System.out.print(i+" ");
    }
    public static void main(String[] args) {
        final int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createAGraph(graph); // creating a graph

        bellmanFord(graph, 0, V);
    }
}