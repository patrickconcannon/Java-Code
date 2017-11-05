
public class UnitConversion {
	private double conUnit1;
	private double conUnit2;
	private double value;

	public void setConUnit(String u1,String u2){
		switch(u1){
			case "in" : conUnit1 = 1; break;
			case "ft" : conUnit1 = 0.0833333; break;
			case "mi" : conUnit1 = 1.578282197e-5; break;
			case "mm" : conUnit1 = 25.4; break;
			case "cm" : conUnit1 = 2.54; break;
			case "m"  : conUnit1 = 0.254; break;
			case "km" : conUnit1 = 0.00254; break;
			default : System.out.println("unknown unit");break;
		}
		switch(u2){
			case "in" : conUnit2 = 1; break;
			case "ft" : conUnit2 = 0.0833333; break;
			case "mi" : conUnit2 = 1.578282197e-5; break;
			case "mm" : conUnit2 = 25.4; break;
			case "cm" : conUnit2 = 2.54; break;
			case "m"  : conUnit2 = 0.254; break;
			case "km" : conUnit2 = 0.00254; break;
			default : System.out.println("unknown unit");break;
		}
	}
	public void setValue(double v){
		value=v;
	}
	public void computeConversion(){
		double x = value/conUnit1;
		System.out.println(  ((x*conUnit2)*value) ); // rounded to two decimal points
	}
	
	
	
	public static void main(String[] args) {
		UnitConversion uc = new UnitConversion();
		uc.setConUnit("km", "ft");
		uc.setValue(100);
		uc.computeConversion();
	}

}
