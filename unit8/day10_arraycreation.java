package unit8;

/**
 * Created by rebeccaxu on 3/13/17.
 */
public class day10_arraycreation {
    public static void main(String[] args) {
        int[] a = new int [10];
        a[3] = 15;
        a[9] = 2;

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d: %d\n", i, a[1]);
        }
        System.out.println(a[10]);
    }
}
