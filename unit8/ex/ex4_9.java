package unit8.ex;
import java.util.Scanner;
/**
 * Created by rebeccaxu on 2/26/17.
 */
public class ex4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score_1 = 0;
        String name_1 = "";

        int score_2 = 0;
        String name_2 = "";

        System.out.println("Enter the number of students.");
        int students = input.nextInt();

        for (int i = 0; i < students; i++) {

            input.nextLine();

            System.out.println("Enter the student's name.");
            String name = input.nextLine();

            System.out.println("Enter the student's score.");
            int score = input.nextInt();

            if (score > score_1) {
                score_1 = score;
                name_1 = name;
            }

            else if (score < score_1 && score > score_2) {
                score_2 = score;
                name_2 = name;

            }

        }
            System.out.println("");
            System.out.println("Highest: " + name_1 + "; " + score_1);
            System.out.println("Second Highest: " + name_2 + "; " + score_2);


    }
}
