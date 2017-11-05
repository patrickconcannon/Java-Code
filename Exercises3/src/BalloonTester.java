import java.util.logging.Logger;

public class BalloonTester {
	public static void main(String[] args){
		Balloon b = new Balloon();
		b.addAir(100);
		Logger.getGlobal().info("The volume of the balloon is: " + b.getVolume());
		Logger.getGlobal().info("The surface area of the balloon is: " +b.getSurfaceArea());
		Logger.getGlobal().info("The radius of the balloon is: " +b.getRadius());
		b.addAir(100);
		Logger.getGlobal().info("The volume of the balloon is: " +b.getVolume());
		Logger.getGlobal().info("The surface area of the balloon is: " +b.getSurfaceArea());
		Logger.getGlobal().info("The radius of the balloon is: " +b.getRadius());
	}
}
