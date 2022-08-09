package de.exxcellent.challenge.Challenges;

import de.exxcellent.challenge.Reader.CSVReaderAdapter;

import java.util.List;


public class WeatherChallenge {

    public String getDayWithSmallestTempSpread() {
        int smallestTempSpread = 0;
        String returnValue = "";

        List<List<String>> weatherData;
        String path = "src/main/resources/de/exxcellent/challenge/weather.csv";
        CSVReaderAdapter ob = new CSVReaderAdapter();
        weatherData = ob.getData(path);
        for (int i = 0; i < weatherData.size(); i++) {
            int tempSpread = Math.abs(Integer.parseInt(weatherData.get(i).get(1)) - Integer.parseInt(weatherData.get(i).get(2)));

            if (smallestTempSpread > tempSpread || smallestTempSpread == 0) {
                smallestTempSpread = tempSpread;
                returnValue = weatherData.get(i).get(0);
            }
        }
        return returnValue;
    }


}
