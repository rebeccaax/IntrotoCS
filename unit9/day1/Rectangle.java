package unit9.day1;

/**
 * Created by rebeccaxu on 4/4/17.
 */
public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle (Point pt1, Point pt2) {
        p1 = new Point (pt1.getx(), pt1.gety());
        p2 = new Point (pt2.getx(), pt2.gety());
    }

    public Rectangle (double x1, double y1, double x2, double y2) {
        p1 = new Point (x1, y1);
        p2 = new Point (x2, y2);
    }

    public double getWidth () {
        return Math.abs(p1.getx() - p2.getx());
    }

    public double getHeight() {
        return Math.abs(p1.gety() - p2.gety());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + 2 * (getHeight()));
    }

    public void translate (double dx, double dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
    }

    public void dilateAboutOrigin (double factor) {
        p1.dilateAboutOrigin(factor);
        p2.dilateAboutOrigin(factor);
    }

    public String toString() {
        return "Rectangle: " + p1 + "; " + p2;
    }


}
