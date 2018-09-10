package day4;
import java.util.Random;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex16_12 extends JFrame {

	public Ex16_12() {
		setTitle("Exercise16_12");
		Random rand = new Random();
		setLayout(new GridLayout(6, 9));

		for (int i = 0; i <54; i++) {
			add(new FanCell(rand.nextInt(20) -10));
		}


		//
		// TODO: Make the frame a grid layout and add a bunch of fans with a different speeds.
		//
		
		add(new FanCell(10));
	}

	public static void main(String[] args) {
		Ex16_12 frame = new Ex16_12();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class FanCell extends JPanel {
	static final int BORDER_WIDTH = 5;
	private int speed = 0;
	private int pos = 0;

	public FanCell (int speed) {
		this.speed = speed;
		Timer timer = new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pos += speed;
				repaint();
			}
		});
		timer.start();

	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		//
		// Draw the enclosing circle
		//
		int dX = getWidth() - (2 * BORDER_WIDTH);
		int dY = getHeight() - (2 * BORDER_WIDTH);		
		g.drawOval (BORDER_WIDTH, BORDER_WIDTH, dX, dY);

		//
		// Draw Arcs
		//
		int minX = 2 * BORDER_WIDTH;
		int minY = 2 * BORDER_WIDTH;
		int maxX = getWidth() - 2 * BORDER_WIDTH;
		int maxY = getHeight() - 2 * BORDER_WIDTH;
		dX = maxX - minX;
		dY = maxY - minY;
				
		g.fillArc (minX, minY, dX, dY, 10 + pos, 30);
		g.fillArc (minX, minY, dX, dY, 100 + pos, 30);
		g.fillArc (minX, minY, dX, dY, 190 + pos, 30);
		g.fillArc (minX, minY, dX, dY, 280 + pos, 30);
	}
}