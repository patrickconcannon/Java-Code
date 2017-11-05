
public class RandomDataAnalyzer {
	
	private int[] dataSet;

	public RandomDataAnalyzer(){
		dataSet = new int[100];
	}
	
	
	public void generateRandomNumbers(){
		
		for(int i = 0; i<100;i++){
			dataSet[i] = (int)Math.round(Math.random()*1000);
			System.out.println(i+1 + ". " + dataSet[i]);
		}

	} 
	
	
	
	
	public static void main(String[] args) {
		
		RandomDataAnalyzer rda = new RandomDataAnalyzer();
		rda.generateRandomNumbers();
		
	}

}
