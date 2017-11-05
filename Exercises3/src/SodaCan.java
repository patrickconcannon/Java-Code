
public class SodaCan {
	
	private final double height;
	private final double diameter;
	
	public SodaCan(double h, double d){
		height = h;
		diameter = d;
	}
	
	public double getVolume(){
		return (Math.PI*(Math.pow((diameter/2), 2))) * 4;
	}
	
	public double getSurfaceArea(){
		return (2*Math.PI *(diameter/2))*height;
	}
}
