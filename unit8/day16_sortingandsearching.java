package unit8;
import java.util.Random;
import java.util.Arrays;
/**
 * Created by rebeccaxu on 3/23/17.
 */
public class day16_sortingandsearching {

    public static int[] getNewArray (int size) {
        int[] a = new int[size];
        Random r = new Random(13);
        for (int i = 0; i<size; i++) {
            a[i] = r.nextInt(1000);
        }
        return a;
    }

    public static void insertionSort (int[] a) {
        for (int i = 1; i < a.length; i++) {
            int num = a[i];

            int j = i-1;
            while (j >= 0 && a[j] > num) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = num;
            System.out.println(i + ": " + Arrays.toString(a));
        }
    }

    public static void selectionSort (int[] a) {
        for (int i = 0; i < a.length; i++) {
            int smPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] <a[smPos]) {
                    smPos = j;
                }
            }

            int temp = a[i];
            a[i] = a[smPos];
            a[smPos] = temp;

            System.out.println(i + ": " + Arrays.toString(a));

        }
    }

    public static void main(String[] args) {
        int[] mynums = getNewArray(10);

        System.out.println(Arrays.toString(mynums));
        insertionSort(mynums);
        System.out.println(Arrays.toString(mynums));
    }
}
