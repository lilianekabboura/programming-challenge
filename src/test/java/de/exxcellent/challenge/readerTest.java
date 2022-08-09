package de.exxcellent.challenge;
import de.exxcellent.challenge.Reader.CSVReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class readerTest {
    final private String path = "src/main/resources/de/exxcellent/challenge/weather.csv";
    CSVReader reader = new CSVReader();
    List<List<String>> data = reader.readFile(path);
    @Test
    void testFileNotEmpty(){
        assertNotNull(data);
    }
    @Test
    void testWeatherData(){
        List<String> expHeader = List.of(
                "Day", "MxT", "MnT", "AvT", "AvDP", "1HrP TPcpn", "PDir", "AvSp", "Dir", "MxS", "SkyC", "MxR", "Mn", "R AvSLP"
        );

        List<String> expFirstLine = List.of(
                "1", "88", "59", "74", "53.8", "0", "280", "9.6", "270", "17", "1.6", "93", "23", "1004.5"
        );
        assertEquals(expHeader, data.get(0));
        assertEquals(expFirstLine, data.get(1));

    }



}
