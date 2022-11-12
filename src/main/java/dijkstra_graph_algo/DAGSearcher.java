package dijkstra_graph_algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * DAG - Directed Acylic Graph
 * To search a Directed Acylic Graph Dijkstra's algorithm can be used.
 *
 * @author William Walsh
 * @version 12 Nov 2022
 */
public class DAGSearcher {
    // Items previously processed
    List<Character> processed = new ArrayList<>();

    // public boolean search(LinkedList<Node>[] vertices, Map<Character, Integer> costs,
    //                       Map<Character, Character> parents, char nodeIdToFind) {
    //
    //     // Set/Reset processed list after each "search" method call.
    //     processed = new ArrayList<>();
    //
    //     // get the first lowest cost node
    //     Character id = findLowestCostNode(costs);
    //
    //     while (id != null) {
    //         int cost = costs.get(id);
    //         List<Node> neighbours = vertices[id];
    //
    //         //?
    //         for (n in neighbours.keys()) {
    //             newCost = cost + neighbours[n];
    //
    //             if (costs[n] > newCost) {
    //                 costs[n] = newCost;
    //                 parents[n] = node;
    //             }
    //         }
    //         processed.add(id);
    //         id = findLowestCostNode(costs);
    //     }
    //
    //     return false;
    // }

    /**
     * Finds the lowest weighted node in map that is not already processed.
     * @param costs Map of char:int
     * @return Character identifying node of least weight.
     */
    public Character findLowestCostNode(Map<Character, Integer> costs) {
        int lowestCost = Integer.MAX_VALUE;
        Character lowestCostNode = null;

        for (Map.Entry<Character,Integer> node : costs.entrySet()) {
            Character id = node.getKey();
            int currentCost = node.getValue();

            if (currentCost < lowestCost && !processed.contains(id)) {
                lowestCost = currentCost;
                lowestCostNode = id;
            }
        }
        return lowestCostNode;
    }
}

class Graph {
    int vertices;
    LinkedList<Edge>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        //initialize adjacency lists for all the vertices
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
}

class Edge {
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

// class Node {
//     char id;
//     int weight;
//
//     public Node(char id, int weight) {
//         this.id = id;
//         this.weight = weight;
//     }
// }
