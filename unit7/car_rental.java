package unit7;

import java.util.Scanner;
/**
 * Created by rebeccaxu on 1/31/17.
 */
public class car_rental {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("What is the name of the first company?");
        String name1 = in.nextLine();

        System.out.println("What is the price to rent the vehicle per day?");
        double priceperday1 = in.nextDouble();

        System.out.println("What is the price per mile?");
        double pricepermile1 = in.nextDouble();


        System.out.println("What is the name of the second company?");
        in.nextLine();

        String name2 = in.nextLine();

        System.out.println("What is the price to rent the vehicle per day?");
        double priceperday2 = in.nextDouble();

        System.out.println("What is the price per mile?");
        double pricepermile2 = in.nextDouble();

        System.out.println("How many miles do you plan to drive?");
        double drive = in.nextDouble();


        double amount1 = (pricepermile1 * drive + priceperday1 );
        double amount2 = (pricepermile2 * drive + priceperday2);


        System.out.printf(name1 + " will cost $%.2f \n", amount1);
        System.out.printf(name2 + " will cost $%.2f \n", amount2);

        if (amount1 < amount2) {
            System.out.println(name1 + " is cheaper.\n");

        }

        else if (amount2 < amount1) {
            System.out.println(name2 + " is cheaper.\n");

        }
    }
}
