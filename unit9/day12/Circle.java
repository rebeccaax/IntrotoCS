package unit9.day12;

/**
 * Created by rebeccaxu on 5/8/17.
 */
public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle (String color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public String toString() {
        return color + " circle @ " + center;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

}
