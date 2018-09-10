package unit10;
import javax.swing.*;
import java.awt.Graphics;

/**
 * Created by rebeccaxu on 5/23/17.
 */
public class Day09_House extends JFrame {

    public Day09_House() {
        setTitle("Our House");
        add (new HousePanel());
    }

    public static void main(String[] args) {
        Day09_House frame = new Day09_House();
        frame.setSize(350, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class HousePanel extends JPanel {
    protected void paintComponent (Graphics g) {
        int x = getWidth();
        int y = getHeight();
        g.drawRect(x/5, y/2, 3 * x / 5, 2 * y / 6);
        g.drawLine(x/5, y/2, x/2, y/6);
        g.drawLine(x/2, y/6, 4 * x / 5, y / 2);
    }

}
