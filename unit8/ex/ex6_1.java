package unit8.ex;
import java.util.Scanner;

/**
 * Created by rebeccaxu on 3/21/17.
 */
public class ex6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number of students.");
        int students = input.nextInt();

        int[] scores = new int[students];
        int best_score = 0;

        System.out.println("enter " + students + " scores: ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > best_score) {
                best_score = scores[i];
            }
        }

            for (int i = 0; i < scores.length; i++) {
                if (scores[i] >= best_score - 10) {
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + 'A');

                } else if (scores[i] >= best_score - 20) {
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + 'B');

                } else if (scores[i] >= best_score - 30) {
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + 'C');

                } else if (scores[i] >= best_score - 40) {
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + 'D');

                } else {
                    System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + 'F');

                }

            }

        }

}
