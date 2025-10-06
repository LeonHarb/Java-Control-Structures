//Assignment 3: Control Structures: PINCheck program
//Challenge #9 by Leon Harb

package challenges;

import java.util.Scanner; 

public class PINCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your PIN");
		int PIN = input.nextInt();
		
		while(PIN > 9999 || PIN < 1000) {
			System.out.println("Your pin must be 4 digits.");
			PIN = input.nextInt();
		}
		
		System.out.println("Please confirm your PIN");
		int confirmationPIN = input.nextInt();
		
		
		while(PIN > confirmationPIN || PIN < confirmationPIN) {
			System.out.println("Incorrect Pin. Try again");
			confirmationPIN = input.nextInt();
		}
		
		System.out.println("PIN accepted. You can access your account.");
		
		
		input.close();
		

	}

}
