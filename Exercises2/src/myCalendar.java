import java.util.Calendar;
import java.util.GregorianCalendar;

public class myCalendar {

	
	public void printFutureDate(int days){
	
		GregorianCalendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH)+ "/" + cal.get(Calendar.YEAR));
	}
	
	public void printFutureBirthday(int days){
		GregorianCalendar myBirthday = new GregorianCalendar(2017, Calendar.FEBRUARY, 24);
		System.out.println("The week that my birth day fell on was a: " + myBirthday.get(Calendar.DAY_OF_WEEK));
		myBirthday.add(Calendar.DAY_OF_MONTH, days);
		System.out.println("In " +days+ " days from my birthday the date will be " + myBirthday.get(Calendar.DAY_OF_MONTH) + "/" + myBirthday.get(Calendar.MONTH)+ "/" + myBirthday.get(Calendar.YEAR));
	}
	
	public static void main(String[] args){
		myCalendar c = new myCalendar();
		c.printFutureDate(100);
		c.printFutureBirthday(10000);
	}
	
}
