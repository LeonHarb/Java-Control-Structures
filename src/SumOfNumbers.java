//Assignment 3: Sum of Numbers from 1 up to the user's input 
//Challenge #6 by Leon Harb

package challenges;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will add all the numbers from 1 to the number you enter");
		System.out.println("Please enter a number");
		int userInput = input.nextInt();
		
		System.out.println("You entered: " + userInput);
		
		int result = 0;
		for(int i = 1; i <= userInput; i++) {
			result += i;
	
			if(i == userInput) {
				System.out.println("The sum of all numbers from 1 to " + userInput + " is: " + result);
			}
		}
		
		
	}

}
