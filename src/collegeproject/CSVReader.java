package csvreader;
import java.io.*;


public class CSVReader {

  
    public static void main(String[] args) {
       

        String csvFile = "C:\\Users\\INDRANIL\\Desktop\\srccollegeprojecttest.csv";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                
                String[] ltt = line.split(cvsSplitBy);

                System.out.println("name[var= " + ltt[10] + " , name=" + ltt[10] + "]");

            }

        } catch (IOException e) {
            
        }

    }

}
