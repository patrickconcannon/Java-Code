
public class QuadracticEquation {
	
	private int a,b,c,x;
	private boolean qFlag;
	
	public QuadracticEquation(int A, int B, int C){
		a=A;
		b=B;
		c=C;
		x = ((b*b) - ((4*a)*c));
		
	}
	
	public boolean hasSolutions(){
		qFlag = (x<0) ? true: false ; 
		return qFlag;
	}
	
	public void getSolution1(){
		if (this.hasSolutions()) System.out.println("0");
		else	 System.out.println((-1 * b) - ((Math.sqrt(x)) / (2*a)));
	}
	
	public void getSolution2(){
		if (this.hasSolutions()) System.out.println("There are no real solutions.");
		else	 System.out.println((-1 * b) + ((Math.sqrt(x)) / (2*a)));
	}
	
	public static void main(String[] args){
		QuadracticEquation q = new QuadracticEquation(3, 11, 2);
		q.getSolution1();
		q.getSolution2();
	}
}
