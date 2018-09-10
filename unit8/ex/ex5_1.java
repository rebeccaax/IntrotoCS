package unit8.ex;

/**
 * Created by rebeccaxu on 3/9/17.
 */
public class ex5_1 {
    public static void main(String[] args) {

        System.out.println("first 100 pentagonal numbers: ");
        for (int n = 1; n <= 100; n++) {

            System.out.printf("%6d ", getPentagonalNumber(n));

            if (n % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;

    }


}


