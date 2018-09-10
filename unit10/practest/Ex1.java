package unit10.practest;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

/**
 * Created by rebeccaxu on 6/5/17.
 */
public class Ex1 extends JFrame {
    public Ex1() {
        setTitle("6x4 Panel");
        add(new GridPanel());
    }

    public static void main(String[] args) {
        Ex1 frame = new Ex1();
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class GridPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 4; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(i * x / 6, j * y / 4, x / 6, y / 4);
                    g.setColor(Color.BLACK);
                    g.fillOval(i * x / 6 + 5, j * y / 4 + 5, x / 6 - 10, y / 4 - 10);
                }

                else if ((i + j) % 2 != 0) {
                    g.setColor(Color.GREEN);
                    g.fillRect(i * x / 6, j * y / 4, x / 6, y / 4);
                    g.setColor(Color.RED);
                    g.fillOval(i * x / 6 + 5, j * y / 4 + 5, x / 6 - 10, y / 4 - 10);
                }

            }

        }

    }

}

