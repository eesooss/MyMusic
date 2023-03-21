import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void readFile() throws IOException {
        String csvFile = "";
        String line;
        String csvSeparator = ",";

        try (FileReader fileReader = new FileReader(csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] columns = line.split(csvSeparator);

                for (String column : columns) {
                    System.out.println(column + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
