package unit7;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 1/31/17.
 */
public class day4_furniture {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the name of the piece?");
        String name = in.nextLine();

        System.out.println("How much did you pay for it?");
        double origPrice = in.nextDouble();

        System.out.println("How much did you sell it for?");
        double soldPrice = in.nextDouble();

        System.out.println("How many hours did you work on it?");
        int hours = in.nextInt();

        double rate = (soldPrice - origPrice) / hours;
        System.out.printf("Your hourly rate is $%.2f.\n", rate);


        if (rate > 20) {
            System.out.println("Great job!");
        }
        else if (rate < 10) {
            System.out.println("You need another job.");
        }
    }
}

