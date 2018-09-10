package unit8;

import java.util.Arrays;
/**
 * Created by rebeccaxu on 3/20/17.
 */
public class day14_subarray {
    public static String[] subArray (String[] array, int start) {
        return subArray (array, start, array.length);

    }
    public static String[] subArray (String[] array, int start, int end) {
        String[] to = new String[end-start];
        int pos = 0;
        for (int i = start; i < end; i++) {
            to[pos] = array[i];
             pos++;

        }
        return to;
    }


    public static void main(String[] args) {
        String[] strings = {"dog", "cat", "hamster", "goldfish", "chipmunk", "squirrel", "armadillo", "chinchilla"};
        System.out.println(Arrays.toString(strings));

        String[] ans1 = subArray (strings, 2, 5);
        System.out.println(Arrays.toString(ans1));

        String[] ans2 = subArray(strings, 4);
        System.out.println(Arrays.toString(ans2));
    }
}
