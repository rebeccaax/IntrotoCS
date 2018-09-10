package unit10.ex_15;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

/**
 * Created by rebeccaxu on 5/25/17.
 */
public class Ex15_10 extends JFrame {
    public Ex15_10() {
        add(new CylinderPanel());
    }

    public static void main(String[] args) {
        Ex15_10 frame = new Ex15_10();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CylinderPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        g.drawOval(x/6,y/12,4*x/6,y/6);
        g.drawLine(x/6,y/6,x/6,5*y/6-15);
        g.drawLine(5*x/6,y/6,5*x/6,5*y/6-15);


        g.drawArc(x/6, 8*y/12,4*x/6,3*y/12, 180, 180);

        g.drawArc(x/6, 8*y/12,4*x/6,3*y/12, 20, 20);
        g.drawArc(x/6, 8*y/12,4*x/6,3*y/12, 60, 20);
        g.drawArc(x/6, 8*y/12,4*x/6,3*y/12, 100, 20);
        g.drawArc(x/6, 8*y/12,4*x/6,3*y/12, 140, 20);

    }

}