package unit9.day12;

/**
 * Created by rebeccaxu on 5/8/17.
 */
public class ShapeTester {
    public static void main(String[] args) {
        Point p1 = new Point (5, 9);
        Point p2 = new Point (1, 6);
        Point p3 = new Point (10, 4);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle ("purple", p1, 6);
        shapes[1] = new Rectangle ("red", p2, p3);
        shapes[2] = new Circle("green" , p3, 4);


        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println(shapes[i].getArea());
            System.out.println();
        }



    }
}
