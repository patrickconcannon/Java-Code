/**
 * A tester class for DataSet.java, and it tests for the expected results of the 
 * DataSet class
 * @author PatrickConcannon
 *
 */
public class DataSetTester {
	public static void main(String[] args){
		
		DataSet d = new DataSet();
		d.AddValue(111);
		d.AddValue(2);
		d.AddValue(35);
		d.AddValue(12);
		d.AddValue(64);
		d.AddValue(133);
		d.AddValue(109);
		d.AddValue(24);
		d.AddValue(11);
		System.out.println(d.getSum());
		System.out.println(d.getAverage());
		System.out.println(d.getLargest());
		System.out.println(d.getSmallest());
		
		
		//finished on exercise 3.7
	}
}
