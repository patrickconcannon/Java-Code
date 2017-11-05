import java.util.Scanner;

public class Easter {
	
	private int easterDay;
	private int easterMonth;
	
	public void gaussAlgorithm(int year){
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b/4;
		int e = b%4;
		int g = ((8 * b + 13) / 25);
		int h = ((((((19 * a) + b) - d) - g) + 15) % 30);
		int j = c/4;
		int k = c%4;
		int m = ((a + 11 * h) / 319);
		int r = (((((((2 * e) + 2) * j) - k) - h) + m) + 32) %7;
		
		easterMonth = ((((h - m) + r) + 90) / 25);
		easterDay = (((((h - m) + r) + easterMonth) + 19) % 32);
		
	}
	
	
	public String getEasterSundayMonth(){
		Month m = new Month(easterMonth);
		return m.getName();
	}
	public int getEasterSundayDay(){
		return easterDay;
	}
	
	public static void main(String[] args){
		Easter e = new Easter();
		System.out.println("For what year do you want to know the date of Easter Sunday? ");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		e.gaussAlgorithm(year);
		System.out.println("In " + year + ", Easter will fall on " + e.getEasterSundayMonth() + " " + e.getEasterSundayDay());
	}
}
