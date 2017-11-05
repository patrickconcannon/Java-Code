import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

/*
  
  I should get in the habit of using encapsulation better 
  
*/



public class DisplayComponent extends JComponent
{
	//the constructor must have something in it that calls on this method
	public void paintComponent(Graphics g)
	{
		Rectangle box = new Rectangle(5, 10, 20, 30);
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 200, 200);
		Line2D.Double segment = new Line2D.Double(0, 0, 200, 200);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.RED);
		
		//g2.draw(box);
		g2.fill(box);
		//box.translate(15, 25);
		//g2.draw(box);
		
		//g2.draw(ellipse);
		//g2.draw(segment);
		//g2.drawString("Paddy", 50, 200);
		

	}
	
	public void openWindow()
	{
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.add(this);

		frame.setVisible(true);

	}
	
	public static void main(String[] args)
	{
		//Show on normal Window
		DisplayComponent dc = new DisplayComponent();
		dc.openWindow();
		
	}
	
}
