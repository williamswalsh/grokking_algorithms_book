package dijkstra_graph_algo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 12 Nov 2022
 */
class DAGSearcherTest {

    public static final int NUMBER_OF_VERTICES = 5;

    // @Test
    // void testSearch() {
    //     // Create an array of linked lists - to represent the graph
    //     LinkedList<Node>[] vertices = new LinkedList[NUMBER_OF_VERTICES];
    //     vertices[0] = new LinkedList<>();
    //
    //     // create map to track weights
    //     Map<Character, Integer> charWeights = new HashMap<>();
    //
    //     // create a map to track parents
    //     Map<Character, Character> parents = new HashMap<>();
    //
    //     // Target to find the shortest path of.
    //     char targetNodeId = 'd';
    //
    //     System.out.println("Shortest Path: " + new DAGSearcher().search(vertices, charWeights, parents, targetNodeId));
    // }

    @Test
    void testFindLowestCostNode() {
        Map<Character, Integer> charWeights = new HashMap<>();
        charWeights.put('a', 3);
        charWeights.put('b', 8);
        charWeights.put('c', 19);
        charWeights.put('d', 2);

        char lowestCostNodeId = new DAGSearcher().findLowestCostNode(charWeights);

        assertEquals('d', lowestCostNodeId);
        assertEquals(2, charWeights.get(lowestCostNodeId));
    }

    @Test
    void testFindLowestCostNodeDifferentWeights() {
        Map<Character, Integer> charWeights = new HashMap<>();
        charWeights.put('a',7);
        charWeights.put('b',8);
        charWeights.put('c',1);
        charWeights.put('d',3);

        char lowestCostNodeId = new DAGSearcher().findLowestCostNode(charWeights);

        assertEquals('c', lowestCostNodeId);
        assertEquals(1, charWeights.get(lowestCostNodeId));
    }

    @Test
    void testFindLowestCostNodeWhenHasNegativeNumbers() {
        Map<Character, Integer> charWeights = new HashMap<>();
        charWeights.put('a',-7);
        charWeights.put('b',8);
        charWeights.put('c',-11);
        charWeights.put('d',4);

        char lowestCostNodeId = new DAGSearcher().findLowestCostNode(charWeights);

        assertEquals('c', lowestCostNodeId);
        assertEquals(-11, charWeights.get(lowestCostNodeId));
    }

    @Test
    void testFindLowestCostNodeWhenAllZeros() {
        Map<Character, Integer> charWeights = new HashMap<>();
        charWeights.put('a',0);
        charWeights.put('b',0);
        charWeights.put('c',0);
        charWeights.put('d',0);

        char lowestCostNodeId = new DAGSearcher().findLowestCostNode(charWeights);

        assertEquals('a', lowestCostNodeId);
        assertEquals(0, charWeights.get(lowestCostNodeId));
    }


}