package unit8.ex;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 3/21/17.
 */
public class ex6_3 {
    public static void main(String[] args) {

        int[] count = new int[100];
        Scanner input = new Scanner(System.in);

        System.out.println("enter the integers between 1 and 100: ");
        int a = input.nextInt();

        while (a != 0) {
            count[a]++;
            a = input.nextInt();
        }

        for (int i = 0;i < count.length; i++) {
            if (count[i] != 0){
                if (count[i] > 1){
                    System.out.println(i + " occurs " + count[i] + " times");
                }

                else {
                    System.out.println(i + " occurs " + count[i] + " time");
                }
            }
        }
    }
}

