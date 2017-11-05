import java.util.Scanner;

public class FindPrime
{
   public static void main(String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      String  primeNumbers = "";//Empty String
      
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();
      scanner.close();
      
      for (int i = 1; i <= n; i++){ 		 		  
         int counter=0; 		  
         for(int num = i; num>=1; num--){
        	 if(i%num==0){
        		 counter++;
        	 } 
         }
         if (counter == 2){ //if it only has two factors (1 and itself) -- it is a prime -- if more, ignore
        	 //Appended the Prime number to the String
        	 primeNumbers = primeNumbers + i + " ";
         }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
   	}
}

