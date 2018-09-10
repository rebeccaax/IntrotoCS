package unit8;

/**
 * Created by rebeccaxu on 2/23/17.
 */
public class day1_ascii_table {
    public static void main(String[] args) {

        System.out.printf("%4s %4s %4s\n", "Deci", "Hexi", "Char");

        for (int i = 33; i < 127; i++) {
            System.out.printf("%4d %4h %4c\n", i, i, i);

        }
    }
}
