package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    public static List<Map<String, String>> where(Map<String, String> options) throws IOException {
        List<String[]> csvData = CsvDataReader.lecturaDeArchivo("src/main/resources/data.csv");
        /*List<String[]> csvData = new ArrayList<String[]>();
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/data.csv"));
        String[] row = null;

        while ((row = reader.readNext()) != null) {
            csvData.add(row);
        }

        reader.close();
        csvData.remove(0);*/
        


        if (options.containsKey("company_name")) {
            csvData = getStrings(x -> x[1].equals(options.get("company_name")), csvData);
        }

        if (options.containsKey("city")) {
            csvData = getStrings(x -> x[4].equals(options.get("city")), csvData);
            /*List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[4].equals(options.get("city"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;*/
        }

        if (options.containsKey("state")) {
            csvData = getStrings(x -> x[5].equals(options.get("state")), csvData);
            /*List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[5].equals(options.get("state"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;*/
        }

        if (options.containsKey("round")) {
            csvData = getStrings(x -> x[6].equals(options.get("round")), csvData);
            /*List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < csvData.size(); i++) {
                if (csvData.get(i)[9].equals(options.get("round"))) {
                    results.add(csvData.get(i));
                }
            }
            csvData = results;*/
        }

        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (String[] i : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", i[0]);
            mapped.put("company_name", i[1]);
            mapped.put("number_employees", i[2]);
            mapped.put("category", i[3]);
            mapped.put("city", i[4]);
            mapped.put("state", i[5]);
            mapped.put("funded_date", i[6]);
            mapped.put("raised_amount", i[7]);
            mapped.put("raised_currency", i[8]);
            mapped.put("round", i[9]);
            output.add(mapped);
        }
        return output;
    }

    private static List<String[]> getStrings(CondIf cond, List<String[]> csvData) {
        List<String[]> results = new ArrayList<String[]>();

        for (String[] row : csvData) {
            if (cond.condicion(row)) {
                results.add(row);
            }
        }
        return results;
    }
}

