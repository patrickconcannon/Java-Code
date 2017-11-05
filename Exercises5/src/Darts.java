import java.util.Random;

public class Darts {

	
	private double[] dataSetX;
	private double[] dataSetY;
	private Random rand; 
	private int r;

	public Darts(){
		dataSetX = new double[100];
		dataSetY = new double[100];
		rand = new Random();
		r = 1;
	}
	
	
	public void genRandomDarts(){	
		
		for(int i = 0; i<100;i++){
			dataSetX[i] = rand.nextDouble() * 2 - 1; //xp
			dataSetY[i] = rand.nextDouble() * 2 - 1; //xp
			//System.out.println("Dart "+ (i+1) + ". " + (Math.round(dataSetX[i] *1000))/1000.0  + " " + (Math.round((dataSetY[i] *1000))) /1000.0);
		}
		
/*
 * 
 * I want to generate random pairs of points (x,y) between 1,1 and -1,-1
 * 
 * 
 * if d < r => "hit!"
 * if d > r => "miss"
 */
		
		
		
	} 
	
	public void checkBoard(){
		for(int i=0;i<100;i++){
			double d = Math.sqrt(Math.pow((dataSetX[i]-0),2) + Math.pow((dataSetY[i]-0),2));
			if(d<r){
				System.out.println("Hit!");
			}else if(d==r){
				System.out.println("OH MY GOD, ITS ON THE CIRCLE");
			}else{
				System.out.println("Miss :-(");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Darts d = new Darts();
		d.genRandomDarts();
		d.checkBoard();
	}

}
