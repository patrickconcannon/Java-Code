import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;


public class Drunk {
	
	private double x,y;
	private Random rand;
	
	public Drunk(double X, double Y){
		x=X;
		y=Y;
		rand = new Random();
	}

	public void draw(Graphics2D g2){
		g2.setColor(Color.RED);
		g2.draw(new Ellipse2D.Double(x, y, 10, 10)); 
	}
	
	public void update(){
		
		x+= rand.nextInt(30+1+30) - 30 ; //  
		y+= rand.nextInt(30+1+30) - 30 ;
	}
	
	
}
