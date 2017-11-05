import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Grid {

	/*
	 * Here I'm going to draw a grid of 20 by 20
	 * 
	 */
	public void draw(Graphics2D g2){
		g2.setColor(Color.BLACK);
		for(int i = 30; i <= 600; i+=30){
			g2.draw(new Line2D.Double(i, 30, i, 600));
			g2.draw(new Line2D.Double(30, i, 600, i));
		}
	}
	
}
