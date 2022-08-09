package de.exxcellent.challenge;

import java.util.List;

public class CSVReaderAdapter {
    public List<List<String>> getData(String filePath){
        CSVReader reader = new CSVReader();
        List<List<String>> data = reader.readFile(filePath);
        data.remove(0);
        return data;
    }
}
