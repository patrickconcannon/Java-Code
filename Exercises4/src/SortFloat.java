import java.util.Scanner;


/**
 * I need to return to this program to figure out which way to compare doubles 
 * @author PatrickConcannon
 *
 */

public class SortFloat {
	double first;
	double second;
	double third;
	
	public void sortFloat(double i, double j, double k){
		if(i>j){
			first = i;
			second = j;
			if(i>k){
				if(j>k){
					third=k;
				}else{
					second=k;
					third=j;
				}
			}else{
				first=k;
				second=i;
				third=j;
			}
		}else {
			first = j;
			second = i;
			if(j>k){
				if(i>k){
					third=k;
				}else{
					second=k;
					third=i;
				}
			}else{
				first=k;
				second=j;
				third=i;
			}
		}
		System.out.println("First: "+ first + " Second: " + second + " Third: " + third);
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		
		double i=s.nextDouble();
		double j=s.nextDouble();
		double k=s.nextDouble();
		SortFloat sf = new SortFloat();
		
		sf.sortFloat(i, j, k);
		
	}
}
