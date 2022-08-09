package de.exxcellent.challenge;

import de.exxcellent.challenge.Challenges.FootballChallenge;
import de.exxcellent.challenge.Challenges.WeatherChallenge;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     *
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
        WeatherChallenge weatherChallenge = new WeatherChallenge();
        FootballChallenge footballChallenge = new FootballChallenge();

        String dayWithSmallestTempSpread = weatherChallenge.getDayWithSmallestTempSpread();     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = footballChallenge.getTeamWithSmallestGoalsDiff(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
