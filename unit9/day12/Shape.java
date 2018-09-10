package unit9.day12;

/**
 * Created by rebeccaxu on 5/8/17.
 */
public abstract class Shape {
    private static int shapecount = 0;

    protected String color;
    private int ShapeNumber;

    public Shape (String color) {
        this.color = color;
        ShapeNumber = shapecount++;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void move (double dx, double dy);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getShapeNumber() {
        return ShapeNumber;
    }

}
