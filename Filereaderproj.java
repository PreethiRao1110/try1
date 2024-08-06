import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereaderproj {

    public static void main(String[] args) {

        try {
            File myFile = new File("/Users/mesinenipreethirao/Downloads/car_prices_3.csv");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                System.out.println(line);
            }
            myScanner.close();
            } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
