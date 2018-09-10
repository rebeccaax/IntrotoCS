package unit9.day9;
import java.util.Scanner;
import java.io.*;
/**
 * Created by rebeccaxu on 4/28/17.
 */
public class listNames {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new FileReader("names.txt"));

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] names = line.split("-");

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }

            System.out.println("-------------");
        }
        in.close();


    }
}
