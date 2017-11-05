import java.util.Scanner;

public class CashRegiserSimulator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		CashRegister register = new CashRegister();
		
		System.out.println("Enter prices: ");
		double price = in.nextDouble();
		register.recordPurchase(price);
		
		System.out.println("Enter dollars: ");
		register.enterDollars(in.nextInt());
		System.out.println("Enter quarters: ");
		register.enterQuarters(in.nextInt());
		System.out.println("Enter dimes: ");
		register.enterDimes(in.nextInt());
		System.out.println("Enter nickels: ");
		register.enterNickels(in.nextInt());
		System.out.println("Enter pennies: ");
		register.enterPennies(in.nextInt());
		
		//register.enterPayment(dollars, quarters, dimes, nickels, pennies);
		register.enterPayment();
		
		System.out.println("Your change: " + register.giveChange());
	}
}
