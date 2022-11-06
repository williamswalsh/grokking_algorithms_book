package breadth_first_search;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author William Walsh
 * @version 06 Nov 2022
 */
public class BreadthFirstSearcher {

    public boolean search(final Map<String, List<String>> graph, final String name) {

        // Q to add nodes to.
        Queue<String> searchQueue = new LinkedList<>(graph.get(name));

        // Create already searched collection
        // This will prevent infinite loops
        List<String> searched = new LinkedList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.remove();

            if (endsWithLetterM(person)) {
                System.out.println(person + " meets the criteria.");
                return true;
            } else {
                System.out.println(person + " doesn't meet the criteria.");
                searchQueue.addAll(graph.get(person));
                searched.add(person);
            }
        }
        System.out.println("No person meets the criteria.");
        return false;
    }

    // Case sensitive
    private boolean endsWithLetterM(String person) {
        return person.endsWith("m");
    }
}
