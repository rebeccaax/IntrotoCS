package unit10.ex_12;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.*;
import java.util.Random;
import javax.swing.JPanel;

/**
 * Created by rebeccaxu on 5/18/17.
 */
public class Ex12_7 extends JFrame {
    private ImageIcon x = new ImageIcon("image/x.gif");
    private ImageIcon o = new ImageIcon("image/o.gif");

    public Ex12_7() {
        int tictactoe = 0;
        JPanel a = new JPanel(new GridLayout(3, 3));
        Border lineBorder = new LineBorder(Color.BLACK, 1);

        while (tictactoe < 9) {
            Random rand = new Random();
            int num = rand.nextInt(3);

            if (num == 0) {
                JLabel panel = new JLabel();
                panel.setBorder(lineBorder);
                a.add(panel);
                tictactoe++;
            }

            else if (num == 1) {
                JLabel panel = new JLabel(x);
                panel.setBorder(lineBorder);
                a.add(panel);
                tictactoe++;
            }

            else if (num == 2) {
                JLabel panel = new JLabel(o);
                panel.setBorder(lineBorder);
                a.add(panel);
                tictactoe++;
            }
        }

        add(a);
    }

    public static void main(String[] args) {
        Ex12_7 frame = new Ex12_7();
        frame.setTitle("Exercise12_7");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}


