package collegeproject;
import java.io.*;


public class CSVReader {

  
    public static void main(String[] args) {
       

        String csvFile = "C:\\Users\\Primus.Flash\\Documents\\NetBeansProjects\\college\\test.csv"; //Update folder and file name here
        String csvSplitBy = ",";
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                
                String[] ltt = line.split(csvSplitBy);

                System.out.println("name[var= " + ltt[0] + " , name=" + ltt[1] + "]");

            }

        } catch (IOException e) {
            System.out.println("No File");
        }

    }

}
