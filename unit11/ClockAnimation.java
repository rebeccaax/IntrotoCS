package unit11;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClockAnimation extends JFrame {
	private StillClock clock = new StillClock();

	public ClockAnimation () {
		add (clock);

		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				clock.setCurrentTime();
				clock.repaint();
			}
		});
		timer.start();
	}

/*	private class TimerListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			clock.setCurrentTime();
			clock.repaint();
		}
	}*/
	
	public static void main(String[] args) {
		ClockAnimation frame = new ClockAnimation();
		frame.setTitle("Clock");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
