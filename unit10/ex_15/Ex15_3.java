package unit10.ex_15;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JButton;

/**
 * Created by rebeccaxu on 5/25/17.
 */

public class Ex15_3 extends JFrame {
    public Ex15_3() {
        setTitle("Displaying a Checkerboard");
        add(new CheckerboardPanel());
    }

    public static void main(String[] args) {
        Ex15_3 frame = new Ex15_3();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CheckerboardPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {

                if ((i + j) % 2 == 0) {
                    g.setColor(Color.WHITE);
                }

                else if ((i + j) % 2 != 0) {
                    g.setColor(Color.BLACK);
                }

                g.fillRect(i * x / 8, j * y / 8, x / 8, y / 8);
            }
        }
    }

}




