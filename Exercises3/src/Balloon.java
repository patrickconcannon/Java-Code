
public class Balloon {
	
	private double airInBalloon;
	private double radius;
	
	public Balloon(){}
	
	/**
	 * Add air to Balloon object by amount value.
	 * @param amount is the value which the area of the balloon is increased by.
	 */
	public void addAir(double amount){
		airInBalloon += amount;
		radius = Math.cbrt(airInBalloon / ((4/3) * Math.PI));
	}
	
	/**
	 * This method returns the volume of the Balloon object.
	 * @return volume the amount of air in the Balloon
	 */
	double getVolume(){
		return airInBalloon;
	}
	
	/**
	 * This method returns the surface area of the Balloon object.
	 * @return surface area the area of the surface of the Balloon
	 */
	double getSurfaceArea(){
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	/**
	 * This method returns the radius of the Balloon object.
	 * @return radius of Balloon object
	 */
	double getRadius(){
		
		return radius;
	}
	
	
}
