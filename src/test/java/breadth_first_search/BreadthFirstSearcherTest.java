package breadth_first_search;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 06 Nov 2022
 */
class BreadthFirstSearcherTest {

    @Test
    void testSearchTargetItemExists() {
        Map<String, List<String>> friendGraph = new HashMap<>();
        friendGraph.put("you", Arrays.asList("alice", "bob", "claire"));
        friendGraph.put("alice", Arrays.asList("peggy"));
        friendGraph.put("bob", Arrays.asList("anuj", "peggy"));
        friendGraph.put("claire", Arrays.asList("thom", "jonny"));
        friendGraph.put("anuj", Collections.emptyList());
        friendGraph.put("peggy", Collections.emptyList());
        friendGraph.put("thom", Collections.emptyList());
        friendGraph.put("jonny", Collections.emptyList());

        assertTrue(new BreadthFirstSearcher().search(friendGraph, "you"));
    }

    @Test
    void testSearchTargetItemDoesntExist() {
        Map<String, List<String>> friendGraph = new HashMap<>();
        friendGraph.put("you", Arrays.asList("alice", "bob", "claire"));
        friendGraph.put("alice", Arrays.asList("peggy"));
        friendGraph.put("bob", Arrays.asList("anuj", "peggy"));
        friendGraph.put("claire", Arrays.asList( "jonny"));
        friendGraph.put("anuj", Collections.emptyList());
        friendGraph.put("peggy", Collections.emptyList());
        friendGraph.put("jonny", Collections.emptyList());

        assertFalse(new BreadthFirstSearcher().search(friendGraph, "you"));
    }
}
