package unit7;
import java.util.Random;

/**
 * Created by rebeccaxu on 2/6/17.
 */
public class day6_swtichstatements {
    public static void main(String[] args) {

        Random r = new Random();

        int num = r.nextInt(6);
        num = 1;
        System.out.println("num=" + num);

        switch (num) {
            case 0:
                System.out.println("It will be sunny tomorrow.");
                break;
            case 1:
                System.out.println("It will be raining.");
                break;
            default:
                System.out.println("I don't know.");
                break;


        }
    }
}
