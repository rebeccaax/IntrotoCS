package unit8.ex;
import java.util.Scanner;

/**
 * Created by rebeccaxu on 3/21/17.
 */
public class ex6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ten integers to be reversed");
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            b[i] = input.nextInt();

        }

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i] + " ");
        }
    }
}


