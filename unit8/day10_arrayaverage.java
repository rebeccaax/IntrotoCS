package unit8;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 3/13/17.
 */
public class day10_arrayaverage {
    public static double[] readNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("how many numbers do you have?");
        int count = input.nextInt();

        System.out.println("enter the numbers.");
        double[] array = new double [count];

        for (int i = 0; i < count; i++) {
            array[i] = input.nextDouble();
        }
        input.close();
        return array;

    }
    public static double getMean (double[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        double[] mynums = readNumbers();
        double avg = getMean(mynums);

        int above = 0;
        int below = 0;
        for (int i = 0; i < mynums.length; i++) {
            if (mynums[i] > avg)
                above++;

            else
                below++;

        }
        System.out.println("average: " + avg);
        System.out.println("above average: " + above);
        System.out.println("below average: " + below);
    }
}
