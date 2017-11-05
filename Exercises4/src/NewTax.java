import java.util.Scanner;

public class NewTax {

	public void checkIncomeBand(double income){
		double tax;
		double x = (int)(income / 25000);
		
		if (x <= 2){				//1st band <50k
			tax = (income * .01); 
		}else if(x > 2 && x <= 3){	//2nd band 50k-75
			tax = ((income-50000) *.02) + 500; 
		}else if(x > 3 && x <= 4){	//3rd band 75k-100
			tax = ((income-75000) *.03) + 500 + 500;
		}else if(x > 4 && x <= 10){ //4th band 100k-250
			tax = ((income-100000) * .04) + 750 + 500 + 500;
		}else if(x > 10 && x <= 20){ //5th band 250k-500
			tax = ((income-250000) * .05) + 1000 + 750 + 500 + 500;
		}else{
			tax = ((income-500000) * .06) + 1250 + 1000 + 750 + 500 + 500;
		}
		System.out.println(tax);
	}
	
	public static void main(String[] args) {
		NewTax n = new NewTax();
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		n.checkIncomeBand(x);
		s.close();
	}

}
