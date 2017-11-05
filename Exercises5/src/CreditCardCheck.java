
public class CreditCardCheck {
	
	private int creditCardNumber;
	private String numberString = "";
	private final int VALID_NUMBER_LEGNTH = 8;
	
	int s,r,q,t;
	String p = "";
	boolean flag = true;

	public CreditCardCheck(int ccn){
		creditCardNumber = ccn;
		numberString = Integer.toString(ccn);
	}
	
	public void checkValidity(){
		for(int i = 0; i < numberString.length();i++){
			if(flag){
				t = Character.getNumericValue(numberString.charAt(i)) * 2;
				p += t;
				flag = false;
			}else{
				s += Character.getNumericValue(numberString.charAt(i));
				flag = true;
			}
		}
		for(int i = 0; i<p.length();i++){
			r += Character.getNumericValue(p.charAt(i));
		}
		System.out.println(r);
		System.out.println(s);
		System.out.println(r+s);
		
	}
	
	public boolean checkLength(){
		if(numberString.length() != VALID_NUMBER_LEGNTH){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		CreditCardCheck ccc = new CreditCardCheck(43589795);
		ccc.checkValidity();
	}
	
	
}
