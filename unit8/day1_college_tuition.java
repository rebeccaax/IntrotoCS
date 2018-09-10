package unit8;

/**
 * Created by rebeccaxu on 2/23/17.
 */
public class day1_college_tuition {
    public static void main(String[] args) {
        double tuition = 46400;

        System.out.printf("%8s %12s\n", "Year", "Tuition");

        for (int y = 2015; y <= 2030; y+=1){
            tuition *= 1.0379;
            System.out.printf("%8d %,12.2f\n", y, tuition);


        }
    }
}
