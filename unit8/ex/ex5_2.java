package unit8.ex;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 3/9/17.
 */
public class ex5_2 {
    public static int sumDigits (long n) {
        int sum = 0;
        while (n > 10) {
            sum += n % 10;
            n = n / 10;

        }
        sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer");
        long integer = input.nextLong();

        System.out.println("the sum of the digits is " + sumDigits(integer));
    }



    }

