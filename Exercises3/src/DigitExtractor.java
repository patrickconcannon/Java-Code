
public class DigitExtractor {
	
	private int workingInt;
	private int returnInt;
	private int digitLength;
	private int length;
	
	/**
	 * Constructs a digit extractor that gets the digits of an integer 
	 * in reverse order. 
	 * @param anInteger the integer breaks up into digits
	 */
	public DigitExtractor(int anInteger){
		workingInt = anInteger;
		digitLength = (int)(Math.log10(workingInt)+1);
		length = digitLength;
	}
	
	/**
	 * Returns the next digit to be extracted by moving the decimal point over and
	 * removing the excess
	 * @return the next digit
	 */
	public void printNextDigit(){
			int intPow = (int)Math.pow(10, (digitLength - 1));
			digitLength--;
			
			returnInt = (workingInt / intPow);
			workingInt -=  (returnInt * intPow);
			
			System.out.println(returnInt);
	}
	
	/**
	 * Returns the number of digits in the working integer parameter 
	 * @return length
	 */
	public int getLength(){
		return length;
	}
	/**
	 * Tester 
	 */
	public static void main(String[] args){
		DigitExtractor d = new DigitExtractor(234567);
		
		for(int i = 0; i<d.getLength();i++)
			d.printNextDigit();
	}
}
