import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String temp = "";
		Double conversionRate = 1.20;

		System.out.println("Enter value in Dollars: ");
		temp = s.nextLine();
		while(!temp.equalsIgnoreCase("q")){
			System.out.println(Double.parseDouble(temp) * conversionRate);
			System.out.println("Please enter a new value in Dollars: ");
			temp = s.nextLine();
		}

	}

}
