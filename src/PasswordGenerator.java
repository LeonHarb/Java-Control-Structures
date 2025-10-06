//Assignment 3: Password Generator of x numbers where x is determined by user 
//Challenge #7 by Leon Harb

package challenges;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many digits do you want to use for a numeric password?");
		int numOfDigits = input.nextInt();
		
		System.out.println("Your password is:");
		
		for(int i = 0; i < numOfDigits; i++) {
			int computerDigit = rand.nextInt(10);
			System.out.print(computerDigit + " ");
		}
		
		input.close();
	}

}
