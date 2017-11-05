
public class Triangle {
	
	private int x1, y1, x2, y2, x3, y3;
	private double side1=8;
	private double side2=6; 
	private double side3=7;
	private double angle1,angle2,angle3;
	
	public Triangle(int X1, int Y1, int X2, int Y2, int X3, int Y3){
		x1 = X1;
		x2 = X2;
		x3 = X3;
		y1 = Y1;
		y2 = Y2;
		y3 = Y3;
	}
	
	public String getSides(){
		side1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		side2 = Math.sqrt(((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1)));
		side3 = Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)));
		
		return "Side1 = " + side1 + " Side2 = " + side2 +" Side3 = " + side3;
	}
	
	public String getAngles(){
		angle1 = Math.acos((side1*side1 + side2*side2 - side3*side3) / (2*side1*side2));
		angle2 = Math.acos((side2*side2 + side3*side3 - side1*side1) / (2*side2*side3));
		angle3 = Math.acos((side3*side3 + side1*side1 - side2*side2) / (2*side3*side1));
		
		return "Angle1 = " + Math.toDegrees(angle1) + " Angle2 = " + Math.toDegrees(angle2) +" Angle3 = " + Math.toDegrees(angle3);
	}
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	public double getArea(){
		return (side1 + side2 + side3) / 2;
	}
	
	public static void main(String[] args){
		Triangle t = new Triangle(4,7,2,1,3,2);
	//	System.out.println(t.getSides());
		System.out.println(t.getAngles());
	}
}
