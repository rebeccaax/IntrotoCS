package unit7;

/**
 * Created by rebeccaxu on 1/31/17.
 */

public class day4_chars {

    public static void main(String[] args) {

        char c = 'A';

        System.out.println(c);
        System.out.println((int) c);
        System.out.println();

        c += 10;

        System.out.println(c);
        System.out.println((int) c);
        System.out.println();

        c += 20;
        System.out.println(c);
        System.out.println((int) c);
        System.out.println();

        c = 14500;
        System.out.println(c);
        System.out.println((int) c);
        System.out.println();

        while (c < 14600) {
            System.out.println(c);
            c++;
        }

    }

}