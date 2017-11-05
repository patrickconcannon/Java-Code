import java.util.logging.Logger;

public class SodaCanTester {
	public static void main(String[] args){
		
		//Logger.getGlobal().setLevel(Level.OFF);
		
		SodaCan soda = new SodaCan(10, 4);		
		Logger.getGlobal().info("The surface area of your soda can is: " + soda.getSurfaceArea());	
		Logger.getGlobal().info("The volume of your soda can is: " + soda.getVolume());
		
	}
}
