package unit8;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 3/13/17.
 */
public class day10_arraydistinct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int n = in.nextInt();
            int pos = -1;

            for (int j = 0; j < count; j++) {
                if (a[j] == n) {
                    pos = j;

                }
            }

            if (pos == -1) {
                a[count] = n;
                count++;

            }
        }


    }
}

