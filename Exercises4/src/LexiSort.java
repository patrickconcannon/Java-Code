
public class LexiSort {
	
	private String name1=""; 
	private String name2="";
	private String name3="";
	
	private String first="";
	private String second="";
	private String third="";
	
	public LexiSort(String n1, String n2, String n3){
		name1=n1;
		name2=n2;
		name3=n3;
	}
	
	public void sortStrings(){
		if(name1.compareTo(name2) < 0){
			first = name1;
			second = name2;
			if(name1.compareTo(name3) < 0) {
				if(name2.compareTo(name3) < 0){
					third=name3;
				}else{
					second=name3;
					third=name2;
				}
			}else{
				first=name3;
				second=name1;
				third=name2;
			}
		}else {
			first = name2;
			second = name1;
			if(name2.compareTo(name3) < 0){
				if(name1.compareTo(name3) < 0){
					third=name3;
				}else{
					second=name3;
					third=name1;
				}
			}else{
				first=name3;
				second=name2;
				third=name1;
			}
		}
		System.out.println("The first name is " + first + " " + second + " "  + third);
	}
	public static void main(String[] args){
		LexiSort l = new LexiSort("Tom", "Dick", "Harry");
		l.sortStrings();
	}
}
