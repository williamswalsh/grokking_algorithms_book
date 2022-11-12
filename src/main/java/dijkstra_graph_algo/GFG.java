package dijkstra_graph_algo;

import java.util.*;

/**
 * Java Program to Implement Dijkstra's Algorithm using Priority Queue.
 *
 * @author Geeks for Geeks
 * @version 12 Nov 2022
 */
public class GFG {

    public int dist[];
    public Set<Integer> settled;
    public PriorityQueue<Node> pq;
    public int numVertices;
    public List<List<Node>> adjacencyList;

    public GFG(int V)
    {
        // This keyword refers to current object itself
        this.numVertices = V;
        dist = new int[V];
        settled = new HashSet<>();
        pq = new PriorityQueue<>(V, new Node());
    }

    public void dijkstra(List<List<Node> > adj, int src)
    {
        this.adjacencyList = adj;

        for (int i = 0; i < numVertices; i++)
            dist[i] = Integer.MAX_VALUE;

        // Add source node to the priority queue
        pq.add(new Node(src, 0));

        // Distance to the source is 0
        dist[src] = 0;

        while (settled.size() != numVertices) {

            // Terminating condition check when
            // the priority queue is empty, return
            if (pq.isEmpty())
                return;

            // Removing the minimum distance node
            // from the priority queue
            int u = pq.remove().node;

            // Adding the node whose distance is
            // finalized
            if (settled.contains(u))

                // Continue keyword skips execution for
                // following check
                continue;

            // We don't have to call e_Neighbors(u)
            // if u is already present in the settled set.
            settled.add(u);

            e_Neighbours(u);
        }
    }

    /**
     * Method 2 - To process all the neighbours of the passed node
     */
    private void e_Neighbours(int u)
    {
        int edgeDistance = -1;
        int newDistance = -1;

        // All the neighbors of v
        for (int i = 0; i < adjacencyList.get(u).size(); i++) {
            Node v = adjacencyList.get(u).get(i);

            // If current node hasn't already been processed
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // If new distance is cheaper in cost
                if (newDistance < dist[v.node])
                    dist[v.node] = newDistance;

                // Add the current node to the queue
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }
}

// Class 2
// Helper class implementing Comparator interface
// Representing a node in the graph
class Node implements Comparator<Node> {

    // Member variables of this class
    public int node;
    public int cost;

    // Constructors of this class

    // Constructor 1
    public Node() {}

    // Constructor 2
    public Node(int node, int cost)
    {

        // This keyword refers to current instance itself
        this.node = node;
        this.cost = cost;
    }

    // Method 1
    @Override public int compare(Node node1, Node node2)
    {

        if (node1.cost < node2.cost)
            return -1;

        if (node1.cost > node2.cost)
            return 1;

        return 0;
    }
}

