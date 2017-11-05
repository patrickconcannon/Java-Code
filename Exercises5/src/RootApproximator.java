
public class RootApproximator {
	
	private double x = 1;
	private double a;
	private double currentBestGuess;
	private double lowerLimit;
	
	public RootApproximator(int A, double aLowerLimit){
		a = A;
		lowerLimit = aLowerLimit;
	}
	
	public double nextGuess(){ // take in 36
		currentBestGuess =  (x + (a/x)) / 2; 
		//System.out.println(currentBestGuess);

		return currentBestGuess;
	}
	
	public boolean hasMoreGuesses(){
		if(Math.abs(currentBestGuess - x) > lowerLimit){
			x = currentBestGuess;
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		double EPSILON = 0.0000001;
		RootApproximator approx = new RootApproximator(1150, EPSILON);
		System.out.println(approx.nextGuess());
		while(approx.hasMoreGuesses()){
			System.out.println(approx.nextGuess());
		}

	}

}
