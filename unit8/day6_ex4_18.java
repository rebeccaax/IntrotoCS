package unit8;

/**
 * Created by rebeccaxu on 3/3/17.
 */
public class day6_ex4_18 {
    public static void main(String[] args) {
        System.out.printf("%3s","Pattern 1\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", j);

            }
            System.out.println();
        }
        System.out.printf("%3s","Pattern 2\n");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();

        }
        System.out.printf("%3s","Pattern 3\n");
            for (int i = 1; i <= 6; i++) {
                for (int j = 6; j > 1; j--) {
                    System.out.print("  ");
            }
                for (int j = i; j >= 1; j--) {
                    System.out.printf("%3d", j);
                }
                System.out.println();
        }

        System.out.printf("%3s","Pattern 4\n");
        for (int i = 6; i >= 1; i--) {
            for (int j = 6; j > 1; j--) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }

    }
}
