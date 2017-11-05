
public class ArithmeticSimulator {
	public static void main(String[] args){
		Arithmetic a = new Arithmetic(100, 27);
		System.out.println("Actual: " + a.computeSum() + "\t" + "Expected: 127.0");
		System.out.println("Actual: " + a.computeDifference() + "\t" + "Expected: 73.0");
		System.out.println("Actual: " + a.computeProduct() + "\t" + "Expected: 2700.0");
		System.out.println("Actual: " + a.computeAverage() + "\t" + "Expected: 63.5");
		System.out.println("Actual: " + a.computeDistance() + "\t" + "Expected: 73.0");
		System.out.println("Actual: " + a.computeMaximum() + "\t" + "Expected: 100.0");
		System.out.println("Actual: " + a.computeMinimum() + "\t" + "Expected: 27.0");
	}
}
