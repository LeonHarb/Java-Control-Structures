//Assignment 3: RockPaperScissors using Scanner input method by Leon Harb

package challenges;

import java.util.Scanner; 
import java.util.Random; 

public class RockPaperScissors {

	public static void main(String[] args) {
		
		// Get user's pick
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 0, 1, or 2\nscissors (0), rock (1), paper (2)");
		int userPick = input.nextInt(); 
		System.out.println("Your pick: " + userPick);
		
		// Generate computer's random pick
		Random rand = new Random();
		int computerRandomPick = rand.nextInt(3); 
		System.out.println("Computer's pick: " + computerRandomPick);
		
		
		if(userPick == 0 || userPick == 1 || userPick == 2) {
			if(userPick == computerRandomPick) {
				System.out.println("Tie.");
			}
			else if(userPick == 0 && computerRandomPick == 1) {
				System.out.println("You lose: Rock beats Scissors.");
			}
			else if(userPick == 1 && computerRandomPick == 0) {
				System.out.println("You win: Rock beats Scissors.");
			}
			else if(userPick == 0 && computerRandomPick == 2) {
				System.out.println("You win: Scissors beats Paper.");
			}
			else if(userPick == 2 && computerRandomPick == 0) {
				System.out.println("You lose: Scissors beats Paper.");
			}
			else if(userPick == 0 && computerRandomPick == 1) {
				System.out.println("You lose: Rock beats Scissors.");
			}
			else if(userPick == 1 && computerRandomPick == 2) {
				System.out.println("You lose: Paper beats Rock.");
			}
			else if(userPick == 2 && computerRandomPick == 1) {
				System.out.println("You win: Paper beats Rock.");
			}
		}
		else {
			System.out.println("ERROR! The value you entered is not an option");
		}
		
		input.close();
		
	}

}
