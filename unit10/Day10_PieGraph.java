package unit10;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

/**
 * Created by rebeccaxu on 5/30/17.
 */
public class Day10_PieGraph extends JFrame {
    public Day10_PieGraph() {
        setTitle("Pie Graph");
        add (new PieGraphPanel());
    }

    public static void main(String[] args) {
        Day10_PieGraph frame = new Day10_PieGraph();
        frame.setSize(350, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class PieGraphPanel extends JPanel {
    protected void paintComponent (Graphics g) {
        int x = getWidth();
        int y = getHeight();

        g.drawOval(x/5, y/5, 3*x/5, 3*y/5);

        g.setColor(Color.RED);
        g.fillArc(x/5, y/5, 3*x/5, 3*y/5, 0, 30);

        g.setColor(Color.BLUE);
        g.fillArc(x/5, y/5, 3*x/5, 3*y/5, 30, 120);

        g.setColor(Color.YELLOW);
        g.fillArc(x/5, y/5, 3*x/5, 3*y/5, 150, 150);

        g.setColor(Color.GREEN);
        g.fillArc(x/5, y/5, 3*x/5, 3*y/5, 300,60 );
    }

}

