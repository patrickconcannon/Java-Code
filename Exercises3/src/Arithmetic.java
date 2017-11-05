
public class Arithmetic {
	
	private double x;
	private double y;
	
	/**
	 * Constructs a number pair
	 * @param firstNumber
	 * @param secondNumber
	 */
	public Arithmetic(double firstNumber, double secondNumber){
		x = firstNumber;
		y = secondNumber;
	}
	/**
	 * Computes the sum of the two entered values
	 * @return sum of values
	 */
	public double computeSum(){
		return x + y;
	}
	
	/**
	 * Computes the difference of the two entered values
	 * @return difference of values
	 */
	public double computeDifference(){
		return x - y;
	}
	
	/**
	 * Computes the product of the two entered values
	 * @return product of values
	 */
	public double computeProduct(){
		return x * y;
	}
	
	/**
	 * Computes the average of the two entered values
	 * @return average of the two values
	 */
	public double computeAverage(){
		return ((x + y) / 2);
	}
	
	/**
	 * Computes the distance of the two entered values
	 * @return distance between two values
	 */
	public double computeDistance(){
		return Math.abs(x - y);
	}
	
	/**
	 * Computes the maximum of the two entered values
	 * @return max value
	 */
	public double computeMaximum(){
		return Math.max(x, y);
	}
	
	/**
	 * Computes the minimum of the two entered values
	 * @return min value
	 */
	public double computeMinimum(){
		return Math.min(x, y);
	}
}
