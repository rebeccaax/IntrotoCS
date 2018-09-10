package unit10.ch12;
import javax.swing.*;
/**
 * Created by rebeccaxu on 5/9/17.
 */
public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrameWithComponents");

        JButton jbtOK = new JButton("OK");
        frame.add(jbtOK);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
