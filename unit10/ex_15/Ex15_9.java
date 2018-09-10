package unit10.ex_15;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

/**
 * Created by rebeccaxu on 5/25/17.
 */
public class Ex15_9 extends JFrame {
    public Ex15_9(){
        setTitle("Creating four fans");
        add(new FansPanel());
        add(new FansPanel());
        add(new FansPanel());
        add(new FansPanel());

    }

    public static void main(String[] args) {
        Ex15_9 frame = new Ex15_9();
        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(2, 2));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class FansPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

        int x = xCenter - radius;
        int y = yCenter - radius;

        g.drawOval(x, y, 2 * radius, 2 * radius);

        g.setColor(Color.BLACK);
        g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);

        g.setColor(Color.BLACK);
        g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);

        g.setColor(Color.BLACK);
        g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);

        g.setColor(Color.BLACK);
        g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);


    }
}

