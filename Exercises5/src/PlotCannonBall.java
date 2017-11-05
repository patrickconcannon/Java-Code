import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class PlotCannonBall {

		
		
		private final double GRAVITATIONAL_FORCE = 9.81;
		private final double deltaT = 0.01;
		
		private int angle;
		private double vx,vy,sx, sy;
		
		public PlotCannonBall(double initialX, double initialY, int a){
			vx=initialX;
			vy=initialY;
			angle=a;
			sx=310;
			sy=310;
		}

		public void draw(Graphics2D g2){
			g2.setColor(Color.RED);
			g2.draw(new Ellipse2D.Double(sx, sy, 10, 10)); 
		}
		
	
		
		
		public void getPosition(){
	
			vx = ((vx * Math.cos(Math.toRadians(angle))) - (GRAVITATIONAL_FORCE * deltaT));
			sx = sx + (vx * deltaT);
			System.out.println(sx);
			
			
			vy = ((vy * Math.sin(Math.toRadians(angle))) - (GRAVITATIONAL_FORCE * deltaT));
			sy = sy + (vy * deltaT);
			System.out.println(sy);
		
			
			//its moving at 100 m per sec
			System.out.println("sx=: " + Math.abs(sx) + "\tsy=:" + Math.abs(sy));
			
		
		}
	
}
