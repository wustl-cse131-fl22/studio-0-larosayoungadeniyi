package studio0;

public class LunchReceipt {

	public static void main(String[] args) {
		
		double burritoPrice = 7.5;
		double drinkPrice = 1.25;
		double chipsPrice = 1.00;
		double guacPrice = 2.50;
		
		double subtotal = burritoPrice + drinkPrice + chipsPrice + guacPrice;
		double taxRate = 0.04225;
		double taxAmount = subtotal * taxRate;
		double total = subtotal + taxAmount;
		//Blah blah blah
		System.out.println("Your total was: $" + total);
	}
	
	
}
