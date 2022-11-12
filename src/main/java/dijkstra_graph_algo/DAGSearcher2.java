package dijkstra_graph_algo;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * DAG - Directed Acylic Graph
 * To search a Directed Acylic Graph Dijkstra's algorithm can be used.
 * A priority queue is used in this implementation to order nodes by their cost(weight).
 *
 * @author William Walsh
 * @version 12 Nov 2022
 */
public class DAGSearcher2 {

    private int numOfNodes;
    private int[] distance;
    private List<List<Node>> adjacencyList;
    private PriorityQueue<Node> priorityQueue;
    private Set<Integer> processedIds;

    public DAGSearcher2(int numOfNodes) {
        this.numOfNodes = numOfNodes;
        this.distance = new int[numOfNodes];
        this.priorityQueue = new PriorityQueue<>(numOfNodes, new Node());
        this.processedIds = new HashSet<>();
    }

    public int[] dijkstra(List<List<Node> > adj, int src) {
        this.adjacencyList = adj;

        for (int i = 0; i < numOfNodes; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // Add source node to the priority queue
        priorityQueue.add(new Node(src, 0));

        // set source node distance = 0
        distance[src] = 0;

        while (processedIds.size() != numOfNodes && !priorityQueue.isEmpty()) {

            // Get the shortest node's distance from top of the pq
            int id = priorityQueue.remove().id;

            // We don't call e_Neighbors(u), if u is already present in the settled set.
            if (processedIds.contains(id)) {
                continue;
            }

            // add to processed queue
            processedIds.add(id);
            processNeighbours(id);
        }
        return distance;
    }

    private void processNeighbours(int id) {
        List<Node> neighbours = adjacencyList.get(id);
        int edgeDistance;
        int newDistance;

        for (Node neighbour : neighbours) {
            if (processedIds.contains(neighbour.id))
                continue;

            edgeDistance = neighbour.cost;
            newDistance = distance[id] + edgeDistance;

            if (newDistance < distance[neighbour.id]) {
                distance[neighbour.id] = newDistance;
            }

            // Add the current "neighbour node" to the queue
            priorityQueue.add(new Node(neighbour.id, distance[neighbour.id]));
        }
    }
}
