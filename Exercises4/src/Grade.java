import java.util.Scanner;


/**
 * -----CLEAN UP-----
 * 
 * @author PatrickConcannon
 *
 */


public class Grade {
	
	private double grade;
	private boolean adGrade;
	
	public Grade(){
		adGrade = true;
	}


	public void getNumericGrade(String letterGrade){

		String letterPart = letterGrade.substring(0,1);
		String additionalPart = letterGrade.substring(1);
		switch(letterPart){
			case "A" : grade = 4; break; 
			case "B" : grade = 3; break;
			case "C" : grade = 2; break;
			case "D" : grade = 1; break; 
			case "F" : grade = 0; adGrade = false;break; 
		}
		if(adGrade){
			if(additionalPart.equalsIgnoreCase("+")){
				grade += 0.3; 
			}else{
				grade -= 0.3;
			}
		}
		System.out.println("Numeric value: " + grade);
	}
	
	public void getLetterGrade(String numericalGrade){
		
		double x = Double.parseDouble(numericalGrade);
		
		String letterGrade ="";
		String extraGrade = "";
		
		int firstNum = Integer.parseInt(numericalGrade.substring(0,1)); // split up numerical part into sub-parts
		double secondNum = Double.parseDouble("0." + numericalGrade.substring(2));
		
		if(secondNum >= 0.15 && secondNum < 0.5){ 
			extraGrade+="+";
		}else if(secondNum >= 0.5 && secondNum < 0.85){
			extraGrade+="-";
			firstNum++;
		}else if(secondNum >= 0.85){
			firstNum++;
		}
		
		if (firstNum > 4) firstNum = 4;
		
		switch(firstNum){
			case 4 : letterGrade = "A"; break; 
			case 3 : letterGrade = "B"; break;
			case 2 : letterGrade = "C"; break;
			case 1 : letterGrade = "D"; break; 
			case 0 : letterGrade = "F"; adGrade = false;break; 
		}
		if(x >= 4.3){ 
			System.out.println("A+");
		}else if(adGrade){
			System.out.println(letterGrade+extraGrade);
		}else{
			System.out.println(letterGrade);
		}
	}
	
	public static void main(String[] args) {
		//System.out.println("Enter a letter grade:");
		System.out.println("Enter a numerical grade: ");
		Scanner s = new Scanner(System.in);
		String myGrade = s.nextLine();
		Grade g = new Grade();
		g.getLetterGrade(myGrade);

	}

}
