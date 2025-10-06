//Assignment 3: Summation program will add all the numbers the user enters
//Challenge #8 by Leon Harb

package challenges;

import java.util.Scanner; 

public class Summation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("This program will add all the numbers you enter");
		System.out.println("Enter 0 for me to stop adding");
		int number = input.nextInt();
		int sum = 0; 
		
		while(number > 0 || number < 0) {
			sum += number; 
			System.out.println("You entered " + number);
			System.out.println("The sum is " + sum);
			number = input.nextInt();
		}
		
		System.out.println("You entered " + number);
		System.out.println("The sum is " + sum);
		System.out.println("The sum of all the numbers you entered is " + sum);
		
		
		input.close();
	
	}

}
