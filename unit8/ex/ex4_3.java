package unit8.ex;

/**
 * Created by rebeccaxu on 2/24/17.
 */
public class ex4_3 {
    public static void main(String[] args) {

        System.out.printf("%9s %7s\n","Kilograms", "Pounds");

        for (int k = 1; k <= 199; k +=2){

            System.out.printf("%9d %7.1f\n",k, k * 2.2);
        }
    }
}
