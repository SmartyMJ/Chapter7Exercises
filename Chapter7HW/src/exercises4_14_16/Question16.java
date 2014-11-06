//Class for Part B
package exercises4_14_16;

import java.util.Scanner;

public class Question16 {
	
	
	//Method for Part A
	public static double getOrderTotal(int bp, int nb){
		double totalPrice;
	
		if (bp + nb >= 12)
			totalPrice = 14.0 * (bp + nb);
		else if (bp + nb >= 3)
			totalPrice = 15.95 * (bp + nb);
		else if (bp == 1 && nb == 1)
			totalPrice = 37.95;
		else
			totalPrice = 18.95 * bp + 21.95 * nb;
	
	return totalPrice;
	}

	public static void main(String[] args){
		
		Scanner orderInput = new Scanner(System.in);
		System.out.println("Enter the number of \"Be Prepared\" you would like to purchase: ");
		int bePrepared = orderInput.nextInt();
		
		System.out.println("Enter the number of \"Next Best\" you would like to purchase: ");
		int nextBest = orderInput.nextInt();
		
		System.out.println("The total cost is $" + getOrderTotal(bePrepared,nextBest) + ".");
		}
	
}
