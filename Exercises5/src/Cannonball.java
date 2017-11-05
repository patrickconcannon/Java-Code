
public class Cannonball {


	private final double GRAVITATIONAL_FORCE = 9.81;
	private final double deltaT = 0.01;
	
	private double v, v0,s,s1,s2;
	
	public Cannonball(double initialVelocity){
		 v = initialVelocity;
		 v0 =  initialVelocity;
	}
	
	
	public void getPosition(){
		for(int t = 1; t<=10;t++){
			for(int t1 = 1; t1<=100;t1++){
				s = (s + (v * deltaT));
				v = (v - (GRAVITATIONAL_FORCE * deltaT));
				
				}
			System.out.println("t=: "+ t + "\tMy Distance = " + s);
			
			s1 = ((GRAVITATIONAL_FORCE*(-0.5))*Math.pow(t,2)) + (v0 * t);
			System.out.println("Formula distance = " + s1);
			System.out.println("");
			//after a while the distance will become negative as the ball is pulled back down to earth
			
		}
	}
	
	public static void main(String[] args){
		Cannonball c = new Cannonball(100);
		c.getPosition();
	}
}
