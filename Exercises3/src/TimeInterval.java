
public class TimeInterval {
	
	
	private final int MIN_IN_HOUR = 60;
	
	private int hours;
	private int minutes;
	private int time1, time2;
	
	public TimeInterval(int t1, int t2){
		if(t1>t2){
			time1 = t2; 
			time2 = t1;
		}else{
			time1 = t1;
			time2 = t2;
		}
	}
	
	public void setHours(){
		int h1 = time1 / ((int) Math.pow(100, ((int)(Math.log(time1) / Math.log(100)))));
		int h2 = time2 / ((int) Math.pow(100, ((int)(Math.log(time2) / Math.log(100)))));
		hours =  h2-h1;
	}

	public void setMinutes(){
		int m1 = time1 % 100;
		int m2 = time2 % 100;
		
		if (m1 > m2){
			minutes = (MIN_IN_HOUR - m1) + m2;
			hours--;
		}else minutes = m2-m1;
	}
	
	public void printTime(){
		this.setHours();
		this.setMinutes();
		System.out.println(hours + " hours\t" + minutes  +" minutes");
	}
	
	public static void main(String[] args){
		TimeInterval t = new TimeInterval(1731, 1621);
		t.printTime();
	}
}
