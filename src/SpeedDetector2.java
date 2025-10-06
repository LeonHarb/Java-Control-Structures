//Assignment 3: Speed Detector2 Challenge #2 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
public class SpeedDetector2 {

	public static void main(String[] args) {
		
		//Ask for the speed
		String input; 
		input = JOptionPane.showInputDialog("Please enter your current speed.");
		int speed = Integer.parseInt(input);
		
		//Create a message dialog box to show the speed value
		JOptionPane.showMessageDialog(null,  "Your current speed is " + speed);
		
		if(speed > 60) {
			JOptionPane.showMessageDialog(null, "Slow Down! Drive safe.", "Ticket Warning", JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.");
		}
		System.exit(0);

	}

}
