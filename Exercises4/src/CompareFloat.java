
public class CompareFloat {

	public void roundOff(double x, double y){
		
		double r = Math.round(x*100);
		double s = Math.round(y*100);

		if (r==s) 
			System.out.println("Success!");
		if((r-s) < 1)
			System.out.println("Double Success!");
	}
	
	
	public static void main(String[] args) {
		CompareFloat c = new CompareFloat();
		c.roundOff(12.337953, 12.34789);

	}

}
