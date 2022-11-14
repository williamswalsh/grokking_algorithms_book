package set_covering_problem;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author William Walsh
 * @version 13 Nov 2022
 */
class SetCoveringSolverTest {

    @Test
    void testFindMinimumStationSet() {

        // AL,AK,AZ,AR,CA,CO
        Set<State> targetStates = new HashSet<>(List.of(State.values()));
        
        Map<Station, Set<State>> stationStateMap = new HashMap<>();
        stationStateMap.put("kacl", Set.of(State.AL, State.AK));
        stationStateMap.put("bbc radio 1", Set.of(State.AR, State.CA, State.CO));
        stationStateMap.put("bbc radio 2", Set.of(State.AR, State.AZ));
        stationStateMap.put("RTE 2fm", Set.of(State.AR, State.AZ));
        stationStateMap.put("RTE 2fm", Set.of(State.CA, State.CO));

        Set<Station> stations = new SetCoveringSolver().findMinimumStationSet(targetStates, stationStateMap);
        System.out.println(stations);
    }
}