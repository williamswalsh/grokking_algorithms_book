package dijkstra_graph_algo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author William Walsh
 * @version 12 Nov 2022
 */
class DAGSearcherTest {

    @Test
    void testDijkstraAlgorithm()
    {
        int numVertices = 5;
        int source = 0;

        // Adjacency list representation of the
        // connected edges by declaring List class object
        // Declaring object of type List<Node>
        List<List<Node>> adj
                = new ArrayList<>();

        // Initialize list for every node
        for (int i = 0; i < numVertices; i++) {
            List<Node> item = new ArrayList<>();
            adj.add(item);
        }

        // Inputs for the GFG(searcher) graph
        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));
        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));

        DAGSearcher searcher = new DAGSearcher(numVertices);
        int[] distance = searcher.search(adj, source);

        // Printing the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");

        for (int i = 0; i < distance.length; i++)
            System.out.println(source + " to " + i + " is "
                    + distance[i]);
    }
}
