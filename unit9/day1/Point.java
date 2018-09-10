package unit9.day1;

/**
 * Created by rebeccaxu on 4/4/17.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate (double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void dilateAboutOrigin (double factor) {
        x *= factor;
        y += factor;
    }

    public double distance (Point p) {

        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public String toString () {
        return "(" + x + ", " + y + ")";
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }
}
