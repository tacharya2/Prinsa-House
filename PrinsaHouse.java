// Java
package Prinsa;

import java.util.Scanner;

public class PrinsaHouse {
	public static void main(String[] args) {
		//Self checkout station at Target
		
		//Scan item Here If Help Needed Please Call An Employee
		//Display Item Name and How Much It Costs
		//Put items into bag and put it into your cart
		
		//Please insert card or select the method of payment
		//Please select if you want your receipt or not
		
		//Please remove your card if the card has been inserted
		
		
		System.out.println("Scan item Here. \nIf Help Needed Please Call An Associate.\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Scan Your Item With The Scanner: ");
		double itemTotal = scanner.nextDouble();
		
		double cartTotal = itemTotal;
		
		System.out.println("Takis-Spicy Chips:\t" + "$"+itemTotal);
	
		double tax = (double) 8/100 * cartTotal;
		
		System.out.println("Tax:\t\t\t" + "$"+ tax);
		
		double subTotal = cartTotal + tax;
		System.out.println("Sub Total:\t\t" + "$"+subTotal);

		System.out.println("\nPut items into bag and put it into your cart.");
		System.out.println("Please insert card or select the method of payment");
		
		System.out.print("Insert Cash:\t");
		
		double amountTend = scanner.nextDouble();
		
		double change = amountTend - subTotal;
		
		System.out.println("Please collect your change from the dispenser: " + change );
		
		System.out.println("Please select if you want your receipt or not.");

		scanner.close();

	}
}