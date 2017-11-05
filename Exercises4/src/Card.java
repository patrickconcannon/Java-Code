import java.util.Scanner;

public class Card {
	
	String cardNotation ="";
	String cardType = "";
	
	public Card(String cN){
		cardNotation = cN;
	}
	
	public void getDescription(){
		String s = "";
		String p = "";
		if(cardNotation.length()!=2){
			System.out.println("Unknown");
		}
		else {
			 s = cardNotation.substring(0, 1);
			 p = cardNotation.substring(1);
		
			 switch(p){
				case "A": cardType = "Ace";break;
				case "J": cardType = "Jack";break;
				case "Q": cardType = "Queen";break;
				case "K": cardType = "King";break;
				case "D": cardType = "Diamonds";break;
				case "H": cardType = "Hearts";break;
				case "S": cardType = "Spades";break;
				case "C": cardType = "Clubs";break;
				default : cardType = "unknown card type"; break;
			 }	 
			 System.out.println(s + " of " + cardType);
		}
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the card Notation: ");
		String x = s.nextLine();
		Card c = new Card(x);
		c.getDescription();
		
		s.close();
		
		

	}

}
