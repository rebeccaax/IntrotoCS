package unit8;

/**
 * Created by rebeccaxu on 3/24/17.
 */
public class sieve_of_eratosthenes {

    public static boolean[] createArray(int iSize) {
        boolean a[] = new boolean[iSize];
        for (int i = 2; i < iSize; i++) {
            a[i] = true;
        }
        return a;
    }

    public static void printPrimes(boolean[] primes, int numsPerLine) {
        int counters = 0;
        for (int i = 2; i < primes.length; i++) {

            if (primes[i] == true) {
                System.out.printf("%6d", i);
                counters++;

                if (counters >= numsPerLine) {
                    System.out.println();
                    counters = 0;
                }
            }
        }
    }

    public static void calculatePrimes(boolean[] primes) {
        for (int i = 2; i <= Math.sqrt(primes.length); i++) {
            if (primes[i]) {
                for (int j = i*2; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[] array = createArray(10000);
        calculatePrimes(array);
        printPrimes(array, 10);

    }

}
