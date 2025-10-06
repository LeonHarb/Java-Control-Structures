// Assignment 3: Calculate the number of Rice on the 64th square and the total number of rice on the board
// Challenge #12 by Leon Harb

package challenges;

import java.lang.Math; 

public class RiceChessBoard {

	public static void main(String[] args) {
		
		// Loop to get the totalNumOfRice
		double totalNumOfRice = 0;
		double rice = 1;
		
		
		for(int i = 1; i < 64; i++) 
		{	
			rice *= 2;
			totalNumOfRice += rice;
			System.out.printf("Square %d has %.0f \n", (i + 1), rice);	
		}
		
		System.out.printf("The total number of rice on the chessboard is %.0f \n", totalNumOfRice);
	
	}
	

}
