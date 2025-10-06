// Assignment 3: Control Structures: Guess the number between 0-100.
// Challenge #11 by Leon Harb

package challenges;

import java.util.Scanner; 
import java.lang.Math; 

public class GuessTheNumber {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 101); // Get the random number between 0 - 100
		
		// Get the initial guess of the user
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100");
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		int numOfGuesses = 1; // Count of the number of guesses. Initialized to 1 to include the first guess that is not in the loop. 
		
		while(guess > random || guess < random) {
			if(guess > random) {
				System.out.println("Your guess is too high. Try again.");
			}
			else if(guess < random) {
				System.out.println("Your guess is too low. Try again.");
			}
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
			numOfGuesses++; 
		}
		
		System.out.println("Yes, the number is " + random);
		System.out.println();
		System.out.println("You guessed the correct number in " + numOfGuesses + " guesses");
		
		input.close();
	}
	
	

}
