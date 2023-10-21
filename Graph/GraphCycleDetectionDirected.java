import java.util.ArrayList;
import java.util.Stack;

public class GraphCycleDetectionDirected
{
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void main(String[] args) {
        final int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createAGraph(graph); // creating a graph

        boolean[] visited = new boolean[V];
        boolean[] rec = new boolean[V];
        for(int i=0; i<V; i++) {
            boolean isCycle = isCycleDetected(graph, visited, rec, 0);
            if(isCycle) {
                System.out.println(true);
                break;
            }
        }
    }

    private static boolean isCycleDetected(ArrayList<Edge>[] graph, boolean[] visited, boolean[] stack, int curr) {
        visited[curr] = true;
        stack[curr] = true;
        for (int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) return true;
            if (!visited[e.dest] && isCycleDetected(graph, visited, stack, e.dest)) return true;
        }
        stack[curr] = false;
        return false;

    }

    private static void createAGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));




    }
}