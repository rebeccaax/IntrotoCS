package unit11;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;
/**
 * Created by rebeccaxu on 6/13/17.
 */
public class Ex16_11 extends JFrame {
    public Ex16_11() {
        CharPanel p = new CharPanel();
        add(p);
        p.setFocusable(true);
    }

    public static void main(String[] args) {
        Ex16_11 frame = new Ex16_11();
        frame.setTitle("Chasing Mouse");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CharPanel extends JPanel {
    String s = "";
    int x = 0;
    int y = 0;

    public CharPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                s = "" + e.getKeyChar();
                repaint();

            }
        });
    }
    protected void paintComponent (Graphics g) {
        //totsuper.paintComponent(g);

        g.drawString(s, x, y);
    }
}