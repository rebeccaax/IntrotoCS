package unit10.practest;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;

/**
 * Created by rebeccaxu on 6/5/17.
 */
public class Ex2 extends JFrame {
    public Ex2() {
        JPanel p = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            p.add(new DiamondPanel());
        }
    add(p);
    }

    public static void main(String[] args) {
        Ex2 frame = new Ex2();
        frame.setTitle("Diamonds Chart");
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class DiamondPanel extends JPanel {
    int r;
    public DiamondPanel() {
    Random random = new Random();
    r = random.nextInt(5);
    }

    protected void paintComponent(Graphics g) {
    super.paintComponent(g);

        int x = getWidth();
        int y = getHeight();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (r == 0) {
                    g.setColor(Color.BLUE.brighter());
                    g.fillRect(x / 4 * i, y / 4 * j, x / 4, y / 4);
                }
                else if (r == 1) {
                    g.setColor(Color.RED.brighter());
                    g.fillRect(x / 4 * i, y / 4 * j, x / 4, y / 4);
                }
                else if (r == 2) {
                    g.setColor(Color.MAGENTA);
                    g.fillRect(x / 4 * i, y / 4 * j, x / 4, y / 4);
                }
                else if (r == 3) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(x / 4 * i, y / 4 * j, x / 4, y / 4);
                }
                else if (r == 4) {
                    g.setColor(Color.GREEN.darker());
                    g.fillRect(x / 4 * i, y / 4 * j, x / 4, y / 4);
                }
                g.setColor(Color.BLACK);
                g.drawLine(10, y / 2, x / 2, 10);
                g.drawLine(x / 2, 10, x - 10, y / 2);
                g.drawLine(x - 10, y / 2, x / 2, y - 10);
                g.drawLine(x / 2, y - 10, 10, y / 2);
                g.drawRect(0,0,x,y);
            }
        }
    }
}