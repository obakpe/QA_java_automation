package JavaFileIO;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV {
    public static void main(String[] args) {
        readCSV();
        writeCSV();
    }
public static void readCSV(){
        String pathToCSV = "C:/Users/David/Desktop/myCSV.csv";

        try(CSVReader csvReader = new CSVReader(new FileReader(pathToCSV))){
            String[] values;
            while ((values = csvReader.readNext())!= null){
                for (String cell: values) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
}

    public static void writeCSV(){
            String filePath ="/Users/David/Desktop/myCSVWrite.csv";
                    String[] headers = {"ID", "Name", "Age", "Country"};
            String[] [] data = {
                    {"1", "Alice", "23", "USA"},
                    {"2", "Bob", "30", "UK"},
                {"3", "Charlie", "35", "Canada"}
        };

            try (BufferedWriter write = new BufferedWriter(new FileWriter(filePath))) {
                // writing headers
                write.write(String.join(",", headers));
                write.newLine();
                // Writing data
                for (String[] record : data) {
                    write.write(String.join(",", record));
                    write.newLine();
                }
                System.out.println("CSV file has been written to desktop.");
            }catch (IOException e) {
                e.printStackTrace();

            }

    }
}


