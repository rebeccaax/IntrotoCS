package day4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex16_14 extends JFrame {

	public Ex16_14() {
		FlagPanel p = new FlagPanel();
		add(p);
		
	}

	public static void main(String[] args) {
		JFrame frame = new Ex16_14();
		frame.setTitle("Raising Flag");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class FlagPanel extends JPanel 
{
	//
	// TODO: Create an instance of your timer listener.
	// 
	private int poleTop = 40;
	private int flagHeight = 30;
	private int flagWidth = 60;	
	private int yPos = 0;
	
	private int vel = 1;

	public FlagPanel (){
		Timer timer = new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yPos += vel;

				//if (yPos > getHeight() -poleTop) {
					//yPos = getHeight() - poleTop;
					//vel = 0;
				//}
				repaint();
			}
		});

		timer.start();
	}

	//
	// TODO: Create a TimerListener inner class
	//

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int h = getHeight();
		int x = getWidth()/5;
		
		g.setColor(Color.BLACK);
		g.fillRect(0, poleTop, 5,h-poleTop);
		
		g.setColor(Color.RED);
		g.fillRect(x + 6, h-yPos, flagWidth, flagHeight);
	}
}
