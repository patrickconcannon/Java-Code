
public class IceCreamCone {
	
	private double surfaceArea;
	private double volume;
	private double height;
	private double radius;
	
	public IceCreamCone(double h, double r){
		h = height;
		r = radius;
	}
	
	
	/**
	 * This method returns the computed surface area of the implicit parameter
	 * @return the surfaceArea for the selected Cone
	 */
	public double getSurfaceArea(){
		surfaceArea = (((Math.PI * radius) * height) + (Math.PI * (Math.pow(radius, 2))));
		return surfaceArea;
	}
	
	/**
	 * This method returns the computed volume of the implicit parameter
	 * @return the volume for the selected Cone
	 */
	public double getVolume(){
		volume = ((height * (Math.PI * (radius * (Math.pow(radius, 2))))) / 3);
		return volume;
	}
}
