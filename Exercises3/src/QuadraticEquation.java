
public class QuadraticEquation {
	
	private int a;
	private int b;
	private int c;
	
	public QuadraticEquation(int A, int B, int C){
		a=A;
		b=B;
		c=C;
	}
	
	public void getSolution1(){
		double root1 = (-1 * b) + (Math.sqrt((Math.pow(b,2)) - (4 * (a * c)))) / (2 * a);
		System.out.println("root 1 = " + root1); 
	 
	}

	public void getSolution2(){
		double root2 =(-1 * b) - (Math.sqrt((Math.pow(b,2)) - (4 * (a * c)))) / (2 * a);
		System.out.println("root 2 = " + root2);
	}
}
