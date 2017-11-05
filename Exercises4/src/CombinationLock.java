import java.util.Scanner;

public class CombinationLock {
	private boolean comFlag = false;
	private boolean first = true;
	private boolean second = false;
	private boolean third = false;

	
	public boolean checkCombination(String x){
		switch(x){
		case "A" : comFlag = false; return comFlag;
		case "B" : comFlag = false; return comFlag;
		case "C" : comFlag = false; return comFlag;
		case "D" : comFlag = false; return comFlag;
		case "E" : comFlag = false; return comFlag;
		case "F" : comFlag = false; return comFlag;
		case "G" : comFlag = false; return comFlag;
		case "H" : comFlag = false; return comFlag;
		case "I" : comFlag = false; return comFlag;
		case "J" : comFlag = false; return comFlag;
		case "K" : comFlag = false; return comFlag;
		case "L" : comFlag = first; first=false; second = true; return comFlag;
		case "M" : comFlag = false; return comFlag;
		case "N" : comFlag = false; return comFlag;
		case "O" : comFlag = second; second=false; third = true; return comFlag;
		case "P" : comFlag = false; return comFlag;
		case "Q" : comFlag = false; return comFlag;
		case "R" : comFlag = third; return comFlag;
		case "S" : comFlag = false; return comFlag;
		case "T" : comFlag = false; return comFlag;
		case "U" : comFlag = false; return comFlag;
		case "V" : comFlag = false; return comFlag;
		case "W" : comFlag = false; return comFlag; 
		case "X" : comFlag = false; return comFlag;
		case "Y" : comFlag = false; return comFlag;
		case "Z" : comFlag = false; return comFlag;
		default : return false; 
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String combination = s.nextLine();
		CombinationLock cl = new CombinationLock();
		
		if(cl.checkCombination(combination.substring(0,1))){
			System.out.println("1!");
			if(cl.checkCombination(combination.substring(1,2))){
				System.out.println("2!");
				if(cl.checkCombination(combination.substring(2,3))){
					System.out.println("3!");
					System.out.println("Success!");
				}else System.out.println("Failure :-(");
			}else System.out.println("Failure :-(");
		}else System.out.println("Failure :-(");
		s.close();
	}

}
