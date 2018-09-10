package unit8;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
/**
 * Created by rebeccaxu on 2/24/17.
 */
public class day2_stats_fun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you plan to enter?");
        int total = input.nextInt();

        double sum = 0;
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;

        for (int i = 0; i < total; i++) {
            double a = input.nextDouble();

            if (a > max)
                max = a;

            if (a < min)
                min = a;

            sum += a;

        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + (sum/total));


    }
}
