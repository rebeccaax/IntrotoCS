package unit7;
import java.util.Scanner;

public class day3_percent_change {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of the object?");
        String name = input.nextLine();

        System.out.println("What was the cost last year?");
        double lastYear = input.nextDouble();

        System.out.println("What is the cost this year?");
        double thisYear = input.nextDouble();

        double pchg = (thisYear - lastYear)/lastYear * 100;

        if (pchg > 0) {
            System.out.printf("The price of %s went up by %.1f%%.", name, pchg);
        }
        else if (pchg < 0) {
            System.out.printf("The price of %s went down by %.1f%%.", name, pchg);
        }
        else {
            System.out.println("The price didn't change.");

        }

    }
}