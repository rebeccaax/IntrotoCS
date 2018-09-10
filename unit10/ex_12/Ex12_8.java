package unit10.ex_12;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 * Created by rebeccaxu on 5/19/17.
 */
public class Ex12_8 extends JFrame {
    public Ex12_8() {
        Border border = new LineBorder(Color.YELLOW);
        Font font = new Font("TimesRoman", Font.BOLD, 20);
        setLayout(new GridLayout(2,3,5,5));

        for (int i = 0; i < 6; i++) {
            JLabel label;
            if (i == 0) {
                label = new JLabel("Black");
                label.setForeground(Color.BLACK);
                label.setToolTipText("Black");
                label.setOpaque(true);
            }

            else if (i == 1) {
                label = new JLabel("Blue");
                label.setForeground(Color.BLUE);
                label.setToolTipText("Blue");
                label.setOpaque(true);
            }

            else if (i == 2) {
                label = new JLabel("Cyan");
                label.setForeground(Color.cyan);
                label.setToolTipText("Cyan");
                label.setOpaque(true);
            }

            else if (i == 3) {
                label = new JLabel("Green");
                label.setForeground(Color.green);
                label.setToolTipText("Green");
                label.setOpaque(true);
            }

            else if (i == 4) {
                label = new JLabel("Magenta");
                label.setToolTipText("Magenta");
                label.setForeground(Color.magenta);
                label.setOpaque(true);
            }

            else {
                label = new JLabel("Orange");
                label.setForeground(Color.ORANGE);
                label.setToolTipText("Orange");
                label.setOpaque(true);
            }

            label.setBackground(Color.WHITE);
            label.setBorder(border);
            label.setFont(font);
            add(label);
        }
    }

    public static void main(String[] args) {
        Ex12_8 frame = new Ex12_8();
        frame.setTitle("Exercise12_8");
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
