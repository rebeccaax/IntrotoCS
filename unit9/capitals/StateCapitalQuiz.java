package unit9.capitals;
import java.util.Scanner;
import javax.swing.*;


/**
 * Created by rebeccaxu on 5/1/17.
 */
public class StateCapitalQuiz {
    public static void main (String[] args) throws java.io.FileNotFoundException {

        Object [] files = {"states_all.txt"};
        //, "states_central.txt", "states_east.txt", "states_small_test.txt",
        //                "states_south.txt", "states_west.txt"

        String response = (String) JOptionPane.showInputDialog (null, "Welcome to the State " +
                "Quiz Challenge!\n " + "Which quiz file would you like to use?", "Input",
                JOptionPane.QUESTION_MESSAGE, null, files, files[0]);


        StateCapitalList list = new StateCapitalList(response);
        int correct = 0;
        int guess = 0;

        while (list.statesRemaining() != 0) {
            StateCapital c = list.getRandomState();
            String answer = (String) JOptionPane.showInputDialog ("What is the capital of " + c.getState());

            if (answer == null) {
                break;
            }

            else if (answer.equalsIgnoreCase(c.getCapital())) {
                JOptionPane.showMessageDialog(null, "Correct!");
                correct++;
                list.remove(c);
            }

            else  {
                JOptionPane.showMessageDialog(null, "Incorrect. The Capital is " + c.getCapital());

            }
            guess++;
        }

        JOptionPane.showMessageDialog(null, "You named " + correct + " capitals in " + guess + " guesses.");

    }
}
