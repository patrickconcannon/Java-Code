import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JComponent;

public class CircleComponent extends JComponent{
	
	private int radius1, radius2;
	
	public CircleComponent(int r1, int r2){
		radius1 = r1;
		radius2 = r2;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		Circle c = new Circle(radius1,radius2);

		c.draw(g2);
	}
}
