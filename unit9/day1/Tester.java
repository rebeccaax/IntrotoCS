package unit9.day1;

/**
 * Created by rebeccaxu on 4/4/17.
 */
public class Tester {
    public static void main(String[] args) {
        /*Point p1 = new Point (9, 12);
        Point p2 = new Point (3, 7);

        Rectangle r = new Rectangle(p1, p2);
        */
        Rectangle r = new Rectangle (10, 2, 17, 3);

        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        r.dilateAboutOrigin(2);

        System.out.println("\n" + r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());


    }
}