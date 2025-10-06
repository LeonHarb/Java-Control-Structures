//Assignment 3: RockPaperScissors2 using dialog boxes input method Challenge #3 by Leon Harb

package challenges;

import java.lang.Math;
import javax.swing.JOptionPane; 
import java.util.Random; 

public class RockPaperScissors2 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		
		// Get the user's pick
		String input; 
		input = JOptionPane.showInputDialog("Enter 0, 1, or 2\nscissors (0), rock (1), paper (2)"); 
		int userPick = Integer.parseInt(input); 
		System.out.println("Your pick: " + userPick);
		
		// Generate computer's random pick
		int computerRandomPick = rand.nextInt(3); 
		System.out.println("Computer's pick: " + computerRandomPick);
		
		// Compare computer's pick and user's pick to determine who wins the game
		if(userPick == 0 || userPick == 1 || userPick ==2) { // Make sure the input is either 0, 1, or 2
			
			// Tie Case. 
			if(userPick == computerRandomPick) { 
				JOptionPane.showMessageDialog(null, "Tie.");
			}
			else if(userPick == 1 && computerRandomPick == 0) {
				JOptionPane.showMessageDialog(null, "You win: Rock beats Scissors.");
			}
			else if(userPick == 0 && computerRandomPick == 2) {
				JOptionPane.showMessageDialog(null, "You win: Scissors beats Paper.");
			}
			else if(userPick == 2 && computerRandomPick == 0) {
				JOptionPane.showMessageDialog(null, "You lose: Scissors beats Paper.");
			}
			else if(userPick == 0 && computerRandomPick == 1) {
				JOptionPane.showMessageDialog(null, "You lose: Rock beats Scissors.");
			}
			else if(userPick == 1 && computerRandomPick == 2) {
				JOptionPane.showMessageDialog(null, "You lose: Paper beats Rock.");
			}
			else if(userPick == 2 && computerRandomPick == 1) {
				JOptionPane.showMessageDialog(null, "You win: Paper beats Rock.");
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter a valid value", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		System.exit(0);
		
	}

}
