package de.exxcellent.challenge;

import java.io.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    public List<List<String>> readFile(String filePath)  {

        List<List<String>> data = new ArrayList<>();


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                data.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(filePath + " not found");

        }
        System.out.println(data);
        return data;
    }


}
