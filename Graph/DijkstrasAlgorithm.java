package Graph;
import java.util.*;

public class DijkstrasAlgorithm {
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    // Pair for Priority Queue
    static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        Pair(int n, int d) {
            node = n;
            dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;   // Min Heap
        }
    }

    // Dijkstra Function
    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        // Initialize distances
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (visited[curr.node]) continue;

            visited[curr.node] = true;

            // Traverse neighbors
            for (Edge e : graph[curr.node]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.weight;

                // Relaxation Step
                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Print Shortest Distances
        System.out.println("Shortest distances from Source " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To " + i + " -> " + dist[i]);
        }
    }

    // Create Graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed Graph Example
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[4].add(new Edge(4, 3, 2));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 5, 5));
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        dijkstra(graph, 0, V); 
    }
}
