package unit9.ex;

/**
 * Created by rebeccaxu on 4/17/17.
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation() {
        a = 0;
        b = 0;
        c = 0;
    }

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
