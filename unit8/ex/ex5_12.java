package unit8.ex;

/**
 * Created by rebeccaxu on 3/9/17.
 */
public class ex5_12 {
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        while (ch1 <= ch2) {
            if (count % numberPerLine == 0) {
                System.out.println();
            }

            System.out.print((char) ch1 + " ");
            ch1 += 1;
            count += 1;
        }
    }
    public static void main (String[] args) {
        printChars( '1',  'Z', 10);
    }
}
