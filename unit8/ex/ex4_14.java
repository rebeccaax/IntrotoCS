package unit8.ex;

/**
 * Created by rebeccaxu on 2/27/17.
 */
public class ex4_14 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 33; i < 127; i++) {
            System.out.printf("%4c", i);
            count++;

            if (count % 10 == 0) {
                System.out.println("");

            }

        }
    }
}
