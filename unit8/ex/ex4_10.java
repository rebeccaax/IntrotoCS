package unit8.ex;

/**
 * Created by rebeccaxu on 2/26/17.
 */
public class ex4_10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf("%5d", i);
                count++;

                if (count % 10 == 0) {
                    System.out.println("");
                }

            }

        }
    }
}
