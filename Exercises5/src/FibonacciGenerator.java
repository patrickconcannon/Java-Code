
public class FibonacciGenerator {

	private int fold1;
	private int fold2;
	private int fnew;
	
	
	public void nextNumber(int n){
		fold1 = 1;
		fold2 = 1;
		fnew = fold1 + fold2;
		int i = 0;
		while(i<n){
			System.out.println(fnew);
			fold2 = fold1;
			fold1 = fnew;
			fnew = fold1 + fold2;
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		FibonacciGenerator fc = new FibonacciGenerator();
		fc.nextNumber(15);
	}

}
