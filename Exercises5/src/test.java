import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args){
	/*	String s = "";
		for(int i = 0; i<10; i++){
			for(int j=0;j<10;j++){
				System.out.print(i*j%10);
				s = "The current value is :" + (i *j%10);
			}
			System.out.println();
		}
		
		int[] myArray = {23,11,44,51,2,33,1,67};
		//System.out.println(myArray[10]);
		int max = 0;
		
		int min = myArray[0];
		for(int i=0; i< myArray.length; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}else if(myArray[i] < min){
				min = myArray[i];
			}
		}
		System.out.println("min = " + min + " max = " + max);
		String[] myStringArray = new String[10];
		Scanner s = new Scanner(System.in);
		for(int i=0; i< myStringArray.length; i++){
			myStringArray[i] = s.nextLine();
		}
		for(int i=0; i< myStringArray.length; i++){
			System.out.println(myStringArray[i]);
		}*/
		Random rand = new Random();
		int y = 11;
		int[] x = new int[20];
		for(int i=0; i< 10; i++){
			assert y == 10;//assertions enabled and disabled in run -> run configurations -> arguments -> vm variablesre
			x[i] = i * i; 
			System.out.println(x[i]); 
		}
		
	//	s.close();
		
		
	}
}
