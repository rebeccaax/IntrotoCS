package day4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by rebeccaxu on 6/15/17.
 */
public class Ex16_15 extends JFrame {
    public Ex16_15() {
        CarPanel p = new CarPanel();
        add(p);
    }

    public static void main(String[] args) {
        JFrame frame = new Ex16_15();
        frame.setTitle("Racing Car");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class CarPanel extends JPanel {
    private int yPos = 0;
    private int vel = 0;

    public CarPanel() {
        Timer timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yPos += vel;

                repaint();

            }

        });
        timer.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int h = getHeight();
        int x = getWidth();

    }


}