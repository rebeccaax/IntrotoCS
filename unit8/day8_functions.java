package unit8;

/**
 * Created by rebeccaxu on 3/7/17.
 */
public class day8_functions {
    public static double f (double x) {
        System.out.println("Entering g: (" + x + ")");
        double val =  4 * x + 3;
        System.out.println("Returning from g: " + val);
        return val;
    }
    public static double g (double x, double y) {
        System.out.println("Entering g: (" + x + ", " + y + ")");
        double val = 2 * f(y-3) + f(x);
        System.out.println("Returning from g: " + val);
        return val;

    }
    public static double h (double x, double y) {
        System.out.println("Entering h: (" + x + ", " + y + ")");
        double val = g(x, x + y) + g(y, x - y);
        System.out.println("Returning from h: " + val);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(h(14,20));
    }

}
