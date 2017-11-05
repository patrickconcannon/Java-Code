/**
 * Class that computes the sum and average of entered values
 * @author PatrickConcannon
 *
 */
public class DataSet {
	
	private static double sumTotal = 0;
	private static int count;
	private int largestInt = Integer.MIN_VALUE;
	private int smallestInt = Integer.MAX_VALUE; 

	/**
	 * Add integer value to sum total, and increase number of values by 1
	 * @param int x value added to sum total
	 */
	public void AddValue(int x){
		if (x > largestInt)
			largestInt = x;
		else if (x < smallestInt)
			smallestInt = x;
		sumTotal += x;
		count++;
	}
	/**
	 * returns added total of values entered
	 * @return sumTotal the full sum of values added is returned
	 */
	public int getSum(){
		return (int)sumTotal;
	}
	
	/**
	 * returns the Average of the values added to the 2nd decimal point
	 * @return Average of the sum total
	 */
	public double getAverage(){
		return ((Math.round((sumTotal / count) * 100)) / 100.0);
	}
	
	public int getLargest(){
		return largestInt;
	}
	public int getSmallest(){
		return smallestInt;
	}
}
