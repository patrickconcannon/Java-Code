/**
	A bank account has a balance that can be changed by deposits and withdrawals
*/

public class BankAccount 
{
	private double balance;
	private double interest;
	private double monthlyFee;
	private double monthlyAllowance;
	private int transactionCount = 0;
	
	/**
 	Constructs a bank account with a given balance.
 	@param initialBalance the initial balance.
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
		interest = 0.1;
		monthlyFee = 10;
		monthlyAllowance = 5;
	}
	
	/**
	 	Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		this(1000);
		
	}
	
	/**
	 	Deposits money into the bank account.
	 	@param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance = (balance + amount);
		transactionCount++;
		this.checkTransactionCount();
	}
	
	/**
	 	Withdraws money from the bank account.
	 	@param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		balance = (balance - amount);
		transactionCount++;
		this.checkTransactionCount();
	}
	
	/**
 		Displays current balance within account.
	 */
	public double giveBalance()
	{
		return balance;
	}
	
	/**
	  	Adds interest to the balance currently held within the account. Use the given
	  	interest rate to commute amount to be added to balance.
	  	
	  	@param rate at which interest is applied.
	 */
	public void addInterest(double rate){
		balance += (balance * (rate/100));
	}
	
	/**
  	Default addInterest method. Uses the default interest rate to commute amount
  	to be added to balance.
  	
	 */
	public void addInterest(){
		balance += (balance * interest);
	}
	
	public void setFee(int fee){
		monthlyFee = fee;
	}
	
	public void deductMonthlyCharge(){
			balance = balance - monthlyFee; 
			transactionCount = 0;
	}
	
	public void checkTransactionCount(){
		if(transactionCount > monthlyAllowance){
			this.deductMonthlyCharge();
			System.out.println("You have exceeded your monthly transaction limit.\nYou have been charged a fee.\n\nYour new balance is: " + this.giveBalance());
		}
	}
	
	public static void main(String[] args)
	{
		/*
		BankAccount savingsAccount = new BankAccount();
		savingsAccount.deposit(1000);
		savingsAccount.withdraw(50);
		savingsAccount.withdraw(50);
		savingsAccount.withdraw(50);
		savingsAccount.withdraw(50);
		savingsAccount.withdraw(50);
		savingsAccount.withdraw(50);
		savingsAccount.deposit(1000);
		savingsAccount.withdraw(50);
		System.out.println("Finish");
		
		
		
		*/
		
		//System.out.println(23456 % 10); 
		final int x;
		int n = 23456;
		int ndigits = (int)(Math.log(n) / Math.log(10)); // converts natural log to decimal log
		//System.out.println(ndigits);
		int pow10 = (int) Math.pow(10, ndigits);
		int first = n / pow10;
		//System.out.println(first);
		System.out.println(Math.round(-1.5));
		
		
		
		/*System.out.println("$"+savingsAccount.giveBalance());
		savingsAccount.addInterest();
		System.out.println("Expected balance = $1100. Actual balance = $"+savingsAccount.giveBalance());
		BankAccount b = new BankAccount(1000);
		b.deposit(1000);
		b.withdraw(500);
		b.withdraw(400);
		b.printBalance();
		b.addInterest(10);
		
		
		
		System.out.println("Expected Balance: $" +  b.giveBalance());
		System.out.println("Actual Balance: $1Í100");
		*/
		
	}
	
}
