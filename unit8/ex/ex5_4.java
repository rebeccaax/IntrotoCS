package unit8.ex;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 3/9/17.
 */
public class ex5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer to be reversed\n");
        int integer = input.nextInt();
        reverse (integer);

    }
    public static void reverse (int number) {
        String reverse = "";
        while (number >= 1) {
            reverse += number % 10;
            number /= 10;

        }
        System.out.println("\nthe reverse number is " + reverse);
    }
}
