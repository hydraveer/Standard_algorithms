import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        final int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createAGraph(graph); // creating a graph

        topologicalSort(graph, V);
    }

    private static void topologicalSort(ArrayList<Edge>[] graph, int V) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++) {
            if(!visited[i]) topologicalSortUtil(graph, i, visited, stack);
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    private static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                topologicalSortUtil(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }

    static void createAGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

}