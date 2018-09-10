package unit10.ex_12;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * Created by rebeccaxu on 5/16/17.
 */
public class Ex12_6 extends JFrame {
    private ImageIcon usIcon = new ImageIcon("image/us.jpg");
    private ImageIcon frIcon = new ImageIcon("image/fr.gif");
    private ImageIcon ukIcon = new ImageIcon("image/uk.gif");
    private ImageIcon chinaIcon = new ImageIcon("image/china.jpg");


    public Ex12_6() {
        Border lineBorder = new LineBorder(Color.BLACK, 1);
        setLayout(new GridLayout(2, 2, 0 , 0));
        JLabel us = new JLabel(usIcon);
        JLabel fr = new JLabel(frIcon);
        JLabel uk = new JLabel(ukIcon);
        JLabel china = new JLabel(chinaIcon);

        us.setBorder(lineBorder);
        fr.setBorder(lineBorder);
        uk.setBorder(lineBorder);
        china.setBorder(lineBorder);

        add(us);
        add(fr);
        add(uk);
        add(china);

    }

    public static void main(String[] args) {
        JFrame frame = new Ex12_6();
        frame.setTitle("Exercise12_6");
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
