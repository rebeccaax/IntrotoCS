package unit10.ex_15;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

/**
 * Created by rebeccaxu on 5/25/17.
 */
public class Ex15_7 extends JFrame {
    public Ex15_7() {
        setTitle("TicTacToe");
        JPanel p = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i <= 8; i++) {
            p.add(new tictactoePanel());
        }
        add(p);

        }

    public static void main(String[] args) {
        Ex15_7 frame = new Ex15_7();
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class tictactoePanel extends JPanel {
    private int num;
    public tictactoePanel() {
        Random r = new Random();
        num = r.nextInt(3);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = getWidth();
        int y = getHeight();

        if (num == 1) {
            g.drawLine( x/5,y/5,4*x/5,4*y/5);
            g.drawLine(4*x/5,y/5,x/5,4*y/5);
        }

        else if (num == 2) {
            g.drawOval(x/5,y/5,3*x/5,3*y/5);
        }

        else {

        }

    }

}
