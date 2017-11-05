import java.util.logging.Level;
import java.util.logging.Logger;

public class Square {
	
	private final double length;
	
	public Square(double l){
		length = l;
	}
	
	public double getArea(){
		return length * length;
	}
	
	public double getPerimeter(){
		return length * 4;
	}

	public double getDiagonal(){
		return Math.sqrt((length * length) *2); 
	}
	
	
	public static void main(String[] args){
		
		//Logger.getGlobal().setLevel(Level.OFF);
		
		
		Square s = new Square(4);
		Logger.getGlobal().info("The diagonal length is: " + s.getDiagonal());		
		Logger.getGlobal().info("bla bla bla");
		
		
	}
}
