//Assignment 3: Speed Detector Challenge #1 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
public class SpeedDetector {

	public static void main(String[] args) {
		
		//Ask for the speed
		String input; 
		input = JOptionPane.showInputDialog("Please enter your current speed.");
		int speed = Integer.parseInt(input);
		
		//Create a message dialog box to show the speed value
		JOptionPane.showMessageDialog(null,  "Your current speed is " + speed);
		
		if(speed >= 60) {
			JOptionPane.showMessageDialog(null, "Slow Down! Drive safe.", "Ticket Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		System.exit(0);

	}

}
