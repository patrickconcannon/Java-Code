import java.util.Scanner;

public class Month {
	
	private int monthNumber;
	private String monthName = "";
	
	
	public Month(int m){
		monthNumber = m;
	}
	public String getName(){
		switch(monthNumber){
			case(1): monthName = "January"; break;
			case(2): monthName = "Feburary"; break;
			case(3): monthName = "March"; break;
			case(4): monthName = "April"; break;
			case(5): monthName = "May"; break;
			case(6): monthName = "June"; break;
			case(7): monthName = "July"; break;
			case(8): monthName = "August"; break;
			case(9): monthName = "September"; break;
			case(10): monthName = "October"; break;
			case(11): monthName = "November"; break;
			case(12): monthName = "December"; break;
			default: monthName =  "You must enter a number corrsponding to the months (i.e. 1 - 12)"; break;
		}
		return monthName;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number for the month you wish to print: ");
		int x = s.nextInt();
		while (!(x < 13 && x > 0)){
			System.out.println("You need to enter a number between 1 and 12,inclusive!"
					+ "\nPlease re-enter the number: ");
			x = s.nextInt();
		}
		Month m = new Month(x);
		System.out.println(m.getName());
		s.close();
	}
}
