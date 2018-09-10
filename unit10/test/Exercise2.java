package unit10.test;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Created by rebeccaxu on 6/6/17.
 */
public class Exercise2 extends JFrame {
    public Exercise2() {
        setTitle("Triangle");
        JPanel p = new JPanel(new GridLayout(3, 2));
        for (int i = 0; i < 6; i++) {
            p.add(new TrianglesPanel());
        }
        add(p);

    }

    public static void main(String[] args) {
        Exercise2 frame = new Exercise2();
        frame.setSize(350, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class TrianglesPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth();
        int y = getHeight();
        g.setColor(Color.BLUE);
        g.drawLine(10, y/2, x - 10, y/2);
        g.drawLine(x - 10, y / 2, x / 2, y - 10);
        g.drawLine(x / 2, y - 10, 10, y / 2);

        g.setColor(Color.BLACK);
        g.drawRect(0,0,x,y);

    }
}
