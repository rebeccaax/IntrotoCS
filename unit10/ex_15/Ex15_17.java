package unit10.ex_15;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Created by rebeccaxu on 6/5/17.
 */
public class Ex15_17 extends JFrame {
    public Ex15_17 () {
        setTitle("Hangman");
        add(new HangmanPanel());
    }
    public static void main(String[] args) {
        Ex15_17 frame = new Ex15_17();
        frame.setSize(350, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class HangmanPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        g.drawLine(x/5, y/7, x/5, 6 * y/7);
        g.drawLine(x/5, y/7, 5*x/7, y/7);
        g.drawLine( 5*x/7, y/7, 5*x/7, y/5);
        g.drawOval(5*x/7-y/5/2,y/5,y/5,y/5);
        g.drawLine( 5*x/7, 2*y/5, 5*x/7, 2*y/3);
        g.drawLine(5*x/7,2*y/5, 5*x/7 - 50,2*y/3 - 50);
        g.drawLine(5*x/7,2*y/5, 5*x/7 + 50,2*y/3 - 50);
        g.drawLine(5*x/7,2*y/3, 5*x/7 - 50,2*y/3 + 50);
        g.drawLine(5*x/7,2*y/3, 5*x/7 + 50,2*y/3 + 50);
        g.drawArc(x/5-y/5/2,6*y/7,y/5,y/5/2, 0, 180);
    }

}