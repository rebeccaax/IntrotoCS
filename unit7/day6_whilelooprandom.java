package unit7;

import java.util.Random;

/**
 * Created by rebeccaxu on 2/3/17.
 */
public class day6_whilelooprandom {
    public static void main(String[] args) {

        Random r = new Random();
        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;
        System.out.println("die1: " + die1 + "; die2: " + die2);

        while (!(die1%2 == 0 && die2 == 6)) {
            //while (die1%2 != 0 || die2 != 6) {
            die1 = r.nextInt(6) + 1;
            die2 = r.nextInt(6) + 1;
            System.out.println("die1: " + die1 + "; die2: " + die2);




        }

    }
}
