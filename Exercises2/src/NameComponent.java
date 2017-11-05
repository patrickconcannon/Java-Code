import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class NameComponent extends JComponent{

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		
		Ellipse2D.Double Circle = new Ellipse2D.Double(130, 130, 140, 140);
		g2.setColor(Color.BLACK);
		g2.draw(Circle);
		g2.fill(Circle);
		Ellipse2D.Double zeroCircle = new Ellipse2D.Double(140, 140, 120, 120);
		g2.setColor(Color.WHITE);
		g2.draw(zeroCircle);
		g2.fill(zeroCircle);
		Ellipse2D.Double firstCircle = new Ellipse2D.Double(150, 150, 100, 100);
		g2.setColor(Color.BLACK);
		g2.draw(firstCircle);
		g2.fill(firstCircle);
		Ellipse2D.Double secondCircle = new Ellipse2D.Double(160, 160, 80, 80);
		g2.setColor(Color.WHITE);
		g2.draw(secondCircle);
		g2.fill(secondCircle);
		Ellipse2D.Double thirdCircle = new Ellipse2D.Double(170, 170, 60, 60);
		g2.setColor(Color.BLACK);
		g2.draw(thirdCircle);
		g2.fill(thirdCircle);
		Ellipse2D.Double fourthCircle = new Ellipse2D.Double(180, 180, 40, 40);
		g2.setColor(Color.WHITE);
		g2.draw(fourthCircle);
		g2.fill(fourthCircle);
		Ellipse2D.Double finalCircle = new Ellipse2D.Double(190, 190, 20, 20);
		g2.setColor(Color.BLACK);
		g2.draw(finalCircle);
		g2.fill(finalCircle);
		
		
		
		
		/*//Rectangle box = new Rectangle(100, 100, 200, 200);
		Ellipse2D.Double head = new Ellipse2D.Double(110, 90, 150, 150);
		Ellipse2D.Double eye1 = new Ellipse2D.Double(145, 140, 20, 20);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(205, 140, 20, 20);
		Line2D.Double mouth = new Line2D.Double(150, 200, 220, 200);
		
		
		g2.setColor(Color.BLUE);
		g2.draw(head);
		g2.fill(head);
		g2.setColor(Color.WHITE);
		g2.draw(eye1);
		//g2.fill(eye1);
		g2.draw(eye2);
		g2.setColor(Color.YELLOW);
	
	//	g2.setColor(Color.RED);
		//g2.drawString("Paddy", 180, 200);*/

	}
}
