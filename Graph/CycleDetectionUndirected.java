import java.util.ArrayList;

public class CycleDetectionUndirected {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        final int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createAGraph(graph); // creating a graph
        System.out.println(isCycleUndirected(graph, 0, new boolean[V], -1));

    }

    private static boolean isCycleUndirected(ArrayList<Edge>[] graph, int curr, boolean[] vis, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && par !=e.dest) return true;
            if(!vis[e.dest] && isCycleUndirected(graph, e.dest, vis, curr))  return true;
        }

        return false;

    }

    private static void createAGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
//        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
//        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
//        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

    }
}