import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercises {

	public void getArea(Rectangle r){
		System.out.println("Area: " + (r.getWidth() * r.getHeight()));
	}
	
	public void getPerimeter(Rectangle r){
		System.out.println("Perimeter: " + ((r.getHeight() * 2) + (r.getWidth() * 2)));
	}
	
	public void printLocation(Rectangle r){
		System.out.println(r);
	}
	
	public void growSquare(Rectangle square){
		System.out.println("Old Square: " + square);
		square.grow(25,25);
		square.translate(25, 25);
		System.out.println("New Square: " + square);
	}
	
	public void traslateDemo(Rectangle r){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setBounds(r);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
		r.translate(300, 300);
		frame.setBounds(r);
		
	}

	public void displayColor(Color c){
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.getContentPane().setBackground(c);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void dieSimulator(){
		Random r = new Random();
		System.out.println(r.nextInt(7));
	}	
	
	
	
	public static void main(String[] args) {
		
		Exercises e = new Exercises();
		e.dieSimulator();
		e.dieSimulator();
		e.dieSimulator();
		e.dieSimulator();
		
		
		
		
		
		
		
		
		/*
		Rectangle r = new Rectangle(100, 100, 500, 500);
		Rectangle r1 = new Rectangle(25, 25, 40, 40);
		Color c = new Color(50, 100, 150);
		//e.traslateDemo(r);
		e.displayColor(c);
		
		c = c.brighter();
		c = c.brighter();
		c = c.brighter();
		c = c.brighter();
		e.displayColor(c);
		
		
		c=c.darker();
		e.displayColor(c);
		
		
		
		
		
		
		 
		Rectangle square = new Rectangle(100, 100, 50, 50);
		e.growSquare(square);
		
		Rectangle r2 = r.intersection(r1);
		e.printLocation(r2);
		
		Rectangle r3 = square.intersection(r1); // I can tell that these two rectangles don't overlap 
		e.printLocation(r3); 					// because the dimensions are negative
		
		
		e.getArea(r);
		e.getPerimeter(r);
		
		e.printLocation(r);
		r.translate(10, 0);
		e.printLocation(r);
		r.translate(0, 10);
		e.printLocation(r);
		r.translate(10, 0);
		e.printLocation(r);
		r.translate(0, 10);
		e.printLocation(r);
	
		*/
		
		//System.exit(0);
	}
	
}


