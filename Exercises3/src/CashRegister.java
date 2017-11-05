/**
 * 
 * @author PatrickConcannon
 * Exercises 3. -- From Advanced Data Structures class
 *
 */

/**
 * 
 * A cash registers totals sales and computes change due.
 *
 */
public class CashRegister{
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;
	
	private double purchase;
	private double payment;
	
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	private static int itemCount = 0;
	
	/**
	 * Constructs a cash register with nothing in it.
	 * 
	 */
	public CashRegister(){
		purchase = 0;
		payment = 0;
	}
	
	/**
	 * Records the purchase of an item.
	 * @param amount the price of a purchased item. 
	 * 
	 */
	public void recordPurchase(double amount){
		purchase += amount;
	}
	
	/**
	 * Enters the payment received from the customer.
	 * @param dollars the number of dollars in the payment.
	 * @param quarters the number of quarters in the payment.
	 * @param dimes the number of dimes in the payment.
	 * @param nickels the number of nickels in the payment.
	 * @param pennies the number of pennies in the payment.
	 */
	public void enterPayment(int d, int q, 
			int dm, int n, int p){
		payment = d + (q * QUARTER_VALUE) + (dm * DIME_VALUE) + 
				(n * NICKEL_VALUE) + (p * PENNY_VALUE);
	}
	
	public void enterPayment(){
		payment = dollars + (quarters * QUARTER_VALUE) + (dimes * DIME_VALUE) + 
				(nickels * NICKEL_VALUE) + (pennies * PENNY_VALUE);
	}
	
	/**
	 * Enter the amount of dollars used in purchase.
	 * @param dollars the number of dollars in payment
	 */
	public void enterDollars(int d){
		dollars = d;
		System.out.println(dollars);
	}
	
	/**
	 * Enter the amount of quarters used in purchase.
	 * @param quarters the number of quarters in payment
	 */
	public void enterQuarters(int q){
		quarters = q;
	}
	
	/**
	 * Enter the amount of dimes used in purchase.
	 * @param dimes the number of dimes in payment
	 */
	public void enterDimes(int dm){
		dimes = dm;
	}
	
	/**
	 * Enter the amount of pennies used in purchase.
	 * @param pennies the number of pennies in payment
	 */
	public void enterPennies(int p){
		pennies = p;
	}
	
	/**
	 * Enter the amount of nickels used in purchase.
	 * @param nickels the number of nickels in payment
	 */
	public void enterNickels(int n){
		nickels = n;
	}
	
	/**
	 * Return the number of items purchased in this transaction.
	 * @return the number of items purchased
	 */
	public int getItemCount(){
		return itemCount;
	}
	
	/**
	 * Computes the change due and resets the machine for the next customer.
	 * @return the change due to the customer.
	 */
	public double giveChange(){
		// round change to nearest cent.
		double change = Math.round((payment - purchase) * 1000.0) / 1000.0; 
		
		purchase = 0;
		payment = 0;
		itemCount = 0;
		return change;
	}
}
