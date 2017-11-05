import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

import javax.swing.JFrame;

public class Circle extends Component{
	

	private static int radius1,radius2;

	public Circle(int r1, int r2){
		radius1 = r1;
		radius2 = r2;
	}
	
	public void draw(Graphics2D g2){


		//mark center points
		Point2D.Double cPoint1 = new Point2D.Double(100+(radius1/2), 200+(radius1/2));
		Point2D.Double cPoint2 = new Point2D.Double(200+(radius2/2), 100+(radius2/2));
		
		//create circles
		Ellipse2D.Double mainCircle = new Ellipse2D.Double(100, 200, radius1, radius1 ); 
		Ellipse2D.Double pointCircle = new Ellipse2D.Double(200, 100,radius2 ,radius2 );
		
		//CIRCLE 1: Set colour and draw
		g2.setColor(Color.BLUE);
		g2.draw(mainCircle);
		
		//CIRCLE 2: check for overlap first, and correct colour
		if(cPoint1.distance(cPoint2) <= (radius1/2)+(radius2/2)){
			g2.setColor(Color.GREEN);
		}else{
			g2.setColor(Color.RED);
		}
		
		//CIRCLE 2: draw
		g2.draw(pointCircle);	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the radius for both circles: ");
		Scanner s = new Scanner(System.in);
		int r1 = s.nextInt();
		int r2 = s.nextInt();
		
		
		JFrame frame = new JFrame();
		
		frame.setSize(800, 800);
		frame.setTitle("Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		CircleComponent cc = new CircleComponent(r1, r2);
		
		frame.add(cc);
		frame.setVisible(true);
		
		s.close();
	}

}
