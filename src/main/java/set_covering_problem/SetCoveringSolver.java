package set_covering_problem;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author William Walsh
 * @version 13 Nov 2022
 */
public class SetCoveringSolver {

    public Set<Station> findMinimumStationSet(Set<State> targetStates, Map<Station, Set<State>> stationStateMap) {
        Set<State> covered = new HashSet<>();
        Set<Station> selectedStations = new HashSet<>();
        Station bestStation;
        while(covered.size() < targetStates.size()) {

            for (Map.Entry<Station, Set<State>> entry : stationStateMap.entrySet()) {
                Station station = entry.getKey();
                Set<State> statesCovered = entry.getValue();

                // if station already in selectedStations
                if (selectedStations.contains(station))
                    continue;

                Set<State> intersection = targetStates & statesCovered;
                bestStation
            }
        }
        return selectedStations;
    }
}
