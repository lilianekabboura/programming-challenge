package de.exxcellent.challenge.Challenges;

import de.exxcellent.challenge.Reader.CSVReaderAdapter;

import java.util.List;

public class FootballChallenge {

    public String getTeamWithSmallestGoalsDiff() {
        int goalDiff = 0, smallestGoalDiff = 0;
        String returnValue = "";
        String path = "src/main/resources/de/exxcellent/challenge/football.csv";
        List<List<String>> footballData;
        CSVReaderAdapter footOb = new CSVReaderAdapter();
        footballData = footOb.getData(path);
        for (int i = 0; i < footballData.size(); i++) {
            goalDiff = Math.abs(Integer.parseInt(footballData.get(i).get(5)) - Integer.parseInt(footballData.get(i).get(6)));
            if (smallestGoalDiff > goalDiff || smallestGoalDiff == 0) {
                smallestGoalDiff = goalDiff;
                returnValue = footballData.get(i).get(0);
            }
        }
        return returnValue;
    }

}
