import java.util.Scanner;

public class LeapYear {

	
	public boolean isLeapYear(int year){
		
		if(year % 400 ==0){
			return true;
		}else{
			if (year % 100 == 0) {
				return false;
			}else {
				if (year % 4 == 0){
					return true;
				}else {
					return false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter a year: ");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		LeapYear y = new LeapYear();
		System.out.println("" + year + " a leap year? " + y.isLeapYear(year));
		s.close();
	}

}
