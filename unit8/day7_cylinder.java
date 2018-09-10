package unit8;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 3/6/17.
 */
public class day7_cylinder {
    public static double volume (double r, double h) {

        double v = Math.PI * r * r * h;
        return v;
    }
    public static String askquestion (Scanner input, String question) {
        System.out.println(question);
        String ans = input.nextLine();
        while (ans.length() == 0) {
            System.out.println("Answer can't be blank, please re-enter.");
            ans = input.nextLine();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double radius = 15;
        double height = 3;

        double v = volume (radius, height);
        System.out.println(v);

        String santiAge = askquestion(in, "How old is Santi?");
        System.out.println("His age is " + santiAge);

    }


}
