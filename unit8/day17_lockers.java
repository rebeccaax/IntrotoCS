package unit8;

/**
 * Created by rebeccaxu on 3/24/17.
 */
public class day17_lockers {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[101];

        for (int student = 1; student <= 100; student++) {
            for (int locker = student; locker <= 100; locker += student) {
                lockers[locker] = !lockers[locker];
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (lockers[i]) {
                System.out.println(i);
            }
        }
    }
}
