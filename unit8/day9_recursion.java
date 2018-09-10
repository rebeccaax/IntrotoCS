package unit8;

/**
 * Created by rebeccaxu on 3/9/17.
 */
public class day9_recursion {
    public static int e (int n) {
        System.out.println("Entering e for " + n);
        int val;
        if (n == 0)
            val = 3;

        else if (n == 1)
            val = 4*e(n-1);

        else
            val = 2*(e(n-2) + n);
        System.out.println("Exiting e for " + n + "=" + val);
        return val;

    }

    public static int fib (int n){
        if (n == 0)
            return 0;
        else if (n ==1)
            return 1;
        else
            return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fib(15));
    }
}
