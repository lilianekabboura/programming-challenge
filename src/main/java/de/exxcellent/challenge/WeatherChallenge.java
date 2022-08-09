package de.exxcellent.challenge;

import java.util.List;


public class WeatherChallenge {

    public String getDayWithSmallestTempSpread () {
        int tempSpread =0, smallestTemp=0;
        String returnValue="";

       List<List<String>> weatherData;
       String path = "src/main/resources/de/exxcellent/challenge/weather.csv";
       CSVReaderAdapter ob = new CSVReaderAdapter();
       weatherData = ob.getData(path);
        for (int i =0; i<weatherData.size(); i++){
          tempSpread= Math.abs(Integer.parseInt(weatherData.get(i).get(1)) - Integer.parseInt(weatherData.get(i).get(2)));
          System.out.println(tempSpread);

            if(smallestTemp > tempSpread || smallestTemp == 0){
                smallestTemp = tempSpread;
                returnValue = weatherData.get(i).get(0);
            }
        }
        System.out.println("--------------");
        System.out.println(returnValue);
        return returnValue;
    }


}
