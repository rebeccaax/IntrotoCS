package unit9.ex;

/**
 * Created by rebeccaxu on 4/17/17.
 */
public class Fan {
    public static final String[] SPEED = {"SLOW", "MEDIUM", "FAST"};
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan () {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan (int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + ";" + " Color: " + color + ";" + " radius: " + radius;
        }
        else
            return "Fan is off;" + " Color: " + color + ";" + " radius: " + radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
