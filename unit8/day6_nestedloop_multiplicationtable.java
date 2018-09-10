package unit8;

/**
 * Created by rebeccaxu on 3/3/17.
 */
public class day6_nestedloop_multiplicationtable {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)  {
                System.out.printf("%4d", i * j);

            }
            System.out.println();
        }
    }
}
