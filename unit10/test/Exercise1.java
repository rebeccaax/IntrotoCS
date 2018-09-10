package unit10.test;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise1 extends JFrame {

	public Exercise1() {
		setTitle("Checked Panel");
	
		// No changes are required to the class Exercise1
		
		//
		// TESTING - use the following two test cases to verify your Checked Panel works correctly.
		//
		
		// Test Case 1: Creates a panel with 6 rectangles across and 3 down.
		add(new CheckedPanel(6, 3));
		
		// Test Case 2: Creates a panel with 4 rectangles across and 12 down.
		//add(new CheckedPanel(4, 12));
	}

	public static void main(String[] args) {
		Exercise1 frame = new Exercise1();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

/** The CheckedPanel is a panel of rectangles.  The constructor
	determines the number of rectangles used to subdivide the panel
	in each dimension.  Coloring instructions are provided
 	in paintComponent.
	*/
class CheckedPanel extends JPanel {
	
	/** Constructor for the CheckedPanel.  
	 * numWide determines the number of rectangles will appear horizontally on the panel.  
	 * numHigh determines the number of rectangles will appear vertically on the panel.  
	 */
	private int numWide;
	private int numHigh;
	CheckedPanel (int numWide, int numHigh)
	{
		this.numWide = numWide;
		this.numHigh = numHigh;



		// TODO: Complete implementing constructor.
		//
		// 
		//
	}
	
	/** Draws the panel! */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = getWidth();
		int y = getHeight();

		for (int i = 0; i < numWide; i++) {
			for (int j = 0; j < numHigh; j++) {

				if ((i + j) % 3 == 0) {
					g.setColor(Color.RED);
				}

				else if ((i + j) % 3 == 1) {
					g.setColor(Color.BLUE);
				}

				else if ((i + j) % 3 == 2) {
					g.setColor(Color.GREEN);
				}

				g.fillRect(i * x / numWide, j * y / numHigh, 2*x / numWide, 2*y / numHigh);


			}
		}


		// TODO: Complete implementing paintComponent.
		//
		// For coloring: 
		//    1) If the row + column is divisible by 3, the cell should be RED.
		//    2) If the row + column divided by 3 has a remainder of 1, the cell should be BLUE.
		//    3) If the row + column divided by 3 has a remainder of 2, the cell should be GREEN.		
		//
	}
}