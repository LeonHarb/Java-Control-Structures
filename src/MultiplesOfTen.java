//Assignment 3: Multiples of 10 
//Challenge #5 by Leon Harb

package challenges;

public class MultiplesOfTen {

	public static void main(String[] args) {
		int count = 0; 
		for(int i = 1; i < 101; i++) {
			count++;
			int result = i * 10;
			if(count == 1) {
				System.out.print(result + " ");
			}
			else if(count % 10 == 1) {
				System.out.println();
				System.out.print(result + " ");
			}
			else {
				System.out.print(result + " ");
			}
			
		}
		

	}

}
