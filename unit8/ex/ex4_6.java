package unit8.ex;

/**
 * Created by rebeccaxu on 2/24/17.
 */
public class ex4_6 {
    public static void main(String[] args) {

        System.out.printf("%-12s %-12s %-12s %-12s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        for (int m = 1, k = 20; m <= 10; m++, k+=5) {

            System.out.printf("%-12d %-12.3f %-12d %-12.3f\n", m, m * 1.609, k, k/1.609);

        }
    }
}
