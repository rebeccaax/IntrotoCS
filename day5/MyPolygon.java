package day5;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPolygon extends JFrame {

	public MyPolygon() {
		setTitle("Polygon Art");
		add(new MyPolyPane());
	}

	public static void main(String[] args) {
		MyPolygon frame = new MyPolygon();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyPolyPane extends JPanel {

	public MyPolyPane () {
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int[] x = {20, 150, 180, 130};
		int[] y = {20, 20, 120, 150};

		g.setColor(Color.RED);
		
		g.fillPolygon(x,y,4);
	}
}
