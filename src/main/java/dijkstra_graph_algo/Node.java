package dijkstra_graph_algo;

import java.util.Comparator;

/**
 * @author William Walsh
 * @version 12 Nov 2022
 */
public class Node implements Comparator<Node> {
    int id;
    int cost;

    public Node() {}

    public Node(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    @Override
    public int compare(Node node1, Node node2) {
        return Integer.compare(node1.cost, node2.cost);
    }
}
