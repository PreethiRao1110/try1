import java.io.FileReader;
import java.util.Scanner;

public class FileReaderProj1 {

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("/Users/mesinenipreethirao/Downloads/car_prices_3.csv");
            Scanner sc = new Scanner(fr);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }


    }
}
