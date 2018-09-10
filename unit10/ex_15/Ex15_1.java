package unit10.ex_15;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Created by rebeccaxu on 5/25/17.
 */
public class Ex15_1 extends JFrame {
    public Ex15_1() {
        setTitle("Displaying a 3 X 3 Grid");
            add(new GridPanel());
    }

    public static void main(String[] args) {
        Ex15_1 frame = new Ex15_1();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class GridPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(getWidth() / 3,0,getWidth() / 3,getHeight());
        g.drawLine(getWidth() * 2/3,0, getWidth() * 2/3, getHeight());
        g.setColor(Color.BLUE);
        g.drawLine(0,getHeight() / 3, getWidth(), getHeight() / 3);
        g.drawLine(0, getHeight() * 2/3, getWidth(), getHeight() * 2/3);

        }


}

