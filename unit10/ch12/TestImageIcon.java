package unit10.ch12;
import javax.swing.*;
import java.awt.*;

/**
 * Created by rebeccaxu on 5/12/17.
 */
public class TestImageIcon extends JFrame {
    private ImageIcon usIcon = new ImageIcon ("image/us.jpg");
    private ImageIcon frIcon= new ImageIcon ("image/fr.gif");
    private ImageIcon ukIcon = new ImageIcon ("image/uk.gif");
    private ImageIcon chinaIcon = new ImageIcon ("image/china.jpg");

    public TestImageIcon() {
        setLayout(new GridLayout(1, 4, 5 , 5));
        add(new JLabel(usIcon));
        add(new JLabel(frIcon));
        add(new JLabel(ukIcon));
        add(new JLabel(chinaIcon));
    }

    public static void main(String[] args) {
        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
