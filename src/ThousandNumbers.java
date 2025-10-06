//Assignment 3: Print numbers from 1 - 1000 
//Challenge #4 by Leon Harb

package challenges;


public class ThousandNumbers {

	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		
		while(i < 1001) {
			count++;
			if(count == 1) {
				System.out.print(i + " ");
			}
			else if(count % 10 == 1) {
				System.out.println();
				System.out.print(i + " ");
			}
			else {
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
