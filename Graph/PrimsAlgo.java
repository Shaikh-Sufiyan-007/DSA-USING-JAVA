package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
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
        int cost;

        Pair(int n, int c) {
            node = n;
            cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;   // Min Heap
        }
    }

    // Prim's Algorithm
    public static void prims(ArrayList<Edge>[] graph, int V) {

        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));   // Start from vertex 0

        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (visited[curr.node]) continue;

            visited[curr.node] = true;
            mstCost += curr.cost;

            // Traverse neighbors
            for (Edge e : graph[curr.node]) {
                if (!visited[e.dest]) {
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }

        System.out.println("Total MST Cost = " + mstCost);
    }

    // Create Undirected Graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Since graph is undirected → add both sides
        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));

        graph[0].add(new Edge(0, 2, 15));
        graph[2].add(new Edge(2, 0, 15));

        graph[0].add(new Edge(0, 3, 30));
        graph[3].add(new Edge(3, 0, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[3].add(new Edge(3, 1, 40));

        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 2, 50));
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        prims(graph, V);
    }
}
