package de.exxcellent.challenge;

import java.util.List;

public class WeatherChallenge {

    public static String getDayWithSmallestTempSpread () {
        int tempSpread =0, smallestTemp=0;
        String returnValue="";
        String path = "src/main/resources/de/exxcellent/challenge/weather.csv";
        CSVReader reader = new CSVReader();
        List<List<String>> data = reader.readFile(path);
        data.remove(0);
        System.out.println(data);
        for (int i =0; i<data.size(); i++){
          tempSpread= Math.abs(Integer.parseInt(data.get(i).get(1)) - Integer.parseInt(data.get(i).get(2)));
          System.out.println(tempSpread);

            if(smallestTemp > tempSpread || smallestTemp == 0){
                smallestTemp = tempSpread;
                returnValue = data.get(i).get(0);
            }
        }
        System.out.println("--------------");
        System.out.println(returnValue);
        return returnValue;
    }

    public static void main(String... args)  {
       WeatherChallenge a = new WeatherChallenge();
       a.getDayWithSmallestTempSpread();


    }

}
