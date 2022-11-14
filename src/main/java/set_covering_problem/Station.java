package set_covering_problem;

import java.util.Set;

/**
 * @author William Walsh
 * @version 13 Nov 2022
 */
public class Station {
    final String id;
    final Set<State> statesCovered;

    public Station(String id, Set<State> statesCovered) {
        this.id = id;
        this.statesCovered = statesCovered;
    }
}
