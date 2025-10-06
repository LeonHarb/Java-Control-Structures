//Assignment 3: Control Structures: Coin Toss
//Challenge #10 by Leon Harb

package challenges;

import java.util.Scanner; 
import java.util.Random; 

public class CoinToss {

	public static void main(String[] args) {
		
		// Get the number of tosses from the user
		Scanner input = new Scanner(System.in);
		System.out.println("How many coin tosses do you need?");
		int numOfTosses = input.nextInt();
		
		Random rand = new Random();
		
		System.out.println("Now I will toss the coin " + numOfTosses + " times.");
		
		// Declare two variables that will hold the count of each heads and tails
		int countOfHeads= 0;
		int countOfTails = 0;
		
		// Loop that iterates the number of tosses
		for(int i = 1; i <= numOfTosses; i++) {
			int randomToss = rand.nextInt(2); // Generate randomly between 0 and 1
			
			
			if(randomToss == 0) { // 0 represents my tails
				System.out.println("Toss:\ttails");
				countOfTails++;
			}
			else { 	// 1 represents my heads
				System.out.println("Toss:\theads");
				countOfHeads++;
			}
			
		}
		
		System.out.println("Heads facing up: " + countOfHeads);
		System.out.println("Tails facing up: " + countOfTails);
		
		input.close();
	}

}
