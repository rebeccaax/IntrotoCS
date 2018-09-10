package unit9.day12;

/**
 * Created by rebeccaxu on 5/8/17.
 */
public class Rectangle extends Shape {
    private Point p1;
    private Point p2;

    public Rectangle (String color, Point p1, Point p2) {
        super(color);
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getWidth() {
        return Math.abs(p1.getX() - p2.getY());
    }

    public double getHeight() {
        return Math.abs(p1.getY() - p2.getY());
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() * getHeight());
    }

    @Override
    public void move(double dx, double dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
    }
}
