import java.util.Scanner;

public class DataSet {
	
	private double square,sum,count,x;
	private boolean flag = true;
	
	public void readData(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter floating point numbers\nIf you wish"
				+ "to finish please enter -1");
		
		while(flag){
			x = s.nextDouble();
			if(x == -1){
				flag = false;
			}else{
				sum += x;
				square += Math.pow(x,2);
				count++;		
				System.out.println(x + " " + sum + " " + square + " " + count + " "); 
				}
			}
		System.out.println(Math.sqrt((square - (Math.pow(sum,2)/count)) / (count - 1)));
		}	

	public static void main(String[] args) {
		DataSet ds = new DataSet();
		ds.readData();
	}

}
