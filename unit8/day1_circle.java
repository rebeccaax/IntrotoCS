package unit8;

/**
 * Created by rebeccaxu on 2/23/17.
 */
public class day1_circle {
    public static void main(String[] args) {

        System.out.printf("%7s %12s\n","Radius", "Area");

        for (int r = 0; r <= 35; r+=5){
            System.out.printf("%7d %12.2f\n", r, r*r*Math.PI);
        }

    }
}
