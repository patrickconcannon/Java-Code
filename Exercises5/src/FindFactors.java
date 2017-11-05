import java.util.Scanner;

public class FindFactors {
	private int x;
	private int MIN_FACTOR = 2;

	
	public FindFactors(int x1){
		x = x1;
	}
	
	public void factorise(int n){
		while(n!=1){
			if(n%MIN_FACTOR == 0){
				n = n/MIN_FACTOR;
				System.out.println(MIN_FACTOR);
			}else{
				MIN_FACTOR++;
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		FindFactors ff = new FindFactors(x);
		ff.factorise(x);
	}

}
