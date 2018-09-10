package unit7;

import java.util.Scanner;
/**
 * Created by rebeccaxu on 2/2/17.
 */
public class electronic_piggy_bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Electronic Piggy Bank!");
        System.out.println("How much money is currently in the bank?");
        double money = input.nextDouble();


        System.out.println("\nMENU:");
        System.out.println("(p) - Deposit a penny");
        System.out.println("(n) - Deposit a nickel");
        System.out.println("(d) - Deposit a dime");
        System.out.println("(q) - Deposit a quarter");
        System.out.println("(e) - Exit program and give balance");

        System.out.println("Please press a letter to select an option:");
        input.nextLine();
        String x = input.nextLine();


        while (!x.equals("e")) {

            if (x.equals("p")) {
                money += 0.01;
                System.out.printf("New Balance: $%.2f\n", money);
            }

            else if (x.equals("n")) {
                money += 0.05;
                System.out.printf("New Balance: $%.2f\n", money);
            }

            else if (x.equals("d")) {
                money += 0.10;
                System.out.printf("New Balance: $%.2f\n", money);
            }

            else if (x.equals("q")) {
                money += 0.25;
                System.out.printf("New Balance: $%.2f\n", money);
            }


            else {
                System.out.println("Invalid option.");
            }

            System.out.println("Please press a letter to select an option:\n");

            x = input.nextLine();

        if (x.equals("e")) {
            System.out.printf("Final Balance: $%.2f\n", money);
            System.out.println("\t\tGoodbye");
        }



        }

    }
}