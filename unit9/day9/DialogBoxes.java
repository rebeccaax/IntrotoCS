package unit9.day9;
import javax.swing.*;
/**
 * Created by rebeccaxu on 4/28/17.
 */
public class DialogBoxes {

    public static void main(String[] args) {
        Object[] possibleValues = {"Friend", "Foe"};

        String response = (String) JOptionPane.showInputDialog(null,
                "Are you a friend or foe?", "Input",
                JOptionPane.QUESTION_MESSAGE, null, possibleValues,
                possibleValues[0]);

        String name = (String) JOptionPane.showInputDialog(response +
                "- What is your name?");

        if (name == null)
            JOptionPane.showMessageDialog(null, "You didn't answer!");

        else
            JOptionPane.showMessageDialog(null, "Hello, " + name);

    }
}
