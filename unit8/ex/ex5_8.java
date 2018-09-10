package unit8.ex;

/**
 * Created by rebeccaxu on 3/9/17.
 */
public class ex5_8 {
    public static double celsiusToFahrenheit (double celsius) {
        return (9.0 / 5) * (celsius + 32);
    }

    public static double fahrenheitToCelsius (double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        System.out.printf("%15s %15s %15s %15s", "celsius", "fahrenheit", "celsius", "fahrenheit");
        double f = 120.0;

        for (double c = 40.0; c > 30.0; c--) {
            System.out.printf("\n%15.1f %15.1f %15.1f %15.1f", c, celsiusToFahrenheit(c), f, fahrenheitToCelsius(f));
            f -= 10.0;

        }
    }
}
