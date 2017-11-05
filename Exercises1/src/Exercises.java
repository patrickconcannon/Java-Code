import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.net.URL;


public class Exercises {

	
	public void computeInterest()
	{
		double bankAccount = 10000;
		double months = 0;
		while(bankAccount > 0){
			bankAccount += ((bankAccount/100) * 5) - 500;
			months++;
			System.out.println(bankAccount + " " + months);
		}
		System.out.println("It takes " + months/12 + " years");
	}

	public void findAreaToPaint()
	{
		String s = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the values for width, length, and height of the house: ");
		s = scanner.nextLine();
		System.out.println("Please enter the number of doors and windows: ");
		s += " " + scanner.nextLine();
		System.out.println("Please enter the dimension of the doors and windows (i.e. 10x10)");
		s += " " + scanner.nextLine();
		
		String[] sA = s.split(" ");
		
		int ta = Integer.parseInt(sA[0]) * Integer.parseInt(sA[1]) * Integer.parseInt(sA[2]);
		int d = Integer.parseInt(sA[3]); 
		int w = Integer.parseInt(sA[4]);
		
		int dd = Integer.parseInt(sA[5].substring(0, sA[5].indexOf('x'))) * Integer.parseInt(sA[5].substring(sA[5].indexOf('x') + 1));
		int dw = Integer.parseInt(sA[6].substring(0, sA[6].indexOf('x'))) * Integer.parseInt(sA[6].substring(sA[6].indexOf('x') + 1));
		
		System.out.println("The area that you will need to paint is: " + (ta - ((w * dw) + (d * dd))) + " meteres squared.");
		
		scanner.close();
	}
	
	public void NamePrinter(String name)
	{
		int i = 0;
		String p ="+";
		while(i++<name.length()) p += "-";
		p+="+";
		System.out.println(p);
		System.out.println("|" + name + "|");
		System.out.println(p);
	}
	
	public void printNameLarge(String name)
	{
		name = name.toLowerCase();
		String[][] nameArray = new String[name.length()][5];
		
		for(int i = 0;i <name.length(); i++){
			
			switch(name.charAt(i)){
				case 'a': String[] a  = {"   **    ","  *   *  "," *     * "," ******* "," *     * "}; nameArray[i] = a; break;
				case 'b': String[] b  = {" ****  "," *   * "," ****  "," *   * "," ****  "}; nameArray[i] = b;break;
				case 'c': String[] c  = {"  **** "," *     "," *     "," *     ","  **** "}; nameArray[i] = c;break;
				case 'd': String[] d  = {" ****  "," *   * "," *   * "," *   * "," ****  "}; nameArray[i] = d;break;
				case 'e': String[] e  = {" ***** "," *     "," ****  "," *     "," ***** "}; nameArray[i] = e;break;
				case 'f': String[] f  = {" **** "," *    "," **** "," *    "," *    "}; nameArray[i] = f;break;
				case 'g': String[] g  = {"  ****  "," *      "," *  **  "," *   * ","  ****  "}; nameArray[i] = g;break;
				case 'h': String[] h  = {" *   * "," *   * "," ***** "," *   * "," *   * "}; nameArray[i] = h; break;
				case 'i': String[] ii = {" *** ","  *  ","  *  ","  *  "," *** "}; nameArray[i] = ii; break;
				case 'j': String[] j  = {"    * ","    * ","    * ","    * "," ***  "}; nameArray[i] = j; break;
				case 'k': String[] k  = {" *   * "," *  *  "," * *   "," *  *  "," *   * "}; nameArray[i] = k;break;
				case 'l': String[] l  = {" *    "," *    "," *    "," *    "," **** "}; nameArray[i] = l; break;
				case 'm': String[] m  = {" **   ** "," * * * * "," *  *  * "," *     * "," *     * "}; nameArray[i] = m; break;
				case 'n': String[] n  = {" **    * "," * *   * "," *  *  * "," *    ** "," *     * "}; nameArray[i] = n; break;
				case 'o': String[] o  = {"  ***  "," *   * "," *   * "," *   * ","  ***  "}; nameArray[i] = o;break;
				case 'p': String[] p  = {" ****  "," *   * "," ****  "," *     "," *     "}; nameArray[i] = p;break;
				case 'q': String[] q  = {"  ***   "," *   *  "," *   *  "," * * *  ","  *** * "}; nameArray[i] = q;break;
				case 'r': String[] r  = {" ****  "," *   * "," ****  "," *  *  "," *   * "}; nameArray[i] = r;break;
				case 's': String[] s  = {"  **** "," *     ","  ***  ","     * "," ****  "}; nameArray[i] = s;break;
				case 't': String[] t  = {" ***** ","   *   ","   *   ","   *   ","   *   "}; nameArray[i] = t; break;
				case 'u': String[] u  = {" *   * "," *   * "," *   * "," *   * ","  ***  "}; nameArray[i] = u;break;
				case 'v': String[] v  = {" *       * ","  *     *  ","   *   *   ","    * *    ","     *     "}; nameArray[i] = v;break;
				case 'w': String[] w  = {" *           * ","  *         *  ","   *   *   *   ","    * * * *    ","     *   *     "}; nameArray[i] = w;break;
				case 'x': String[] x  = {" *   * ","  * *  ","   *   ","  * *  "," *   * "}; nameArray[i] = x;break;
				case 'y': String[] y  = {" *   * ","  * *  ","   *   ","  *    "," *     "}; nameArray[i] = y;break;
				case 'z': String[] z  = {" ***** ","     * ","   *   ","  *    "," ***** "}; nameArray[i] = z;break;
				default: String[] dStr ={"    ","    ","    ","    ","    ","    "}; nameArray[i] = dStr; break;
			}
		}

		for(int j = 0;j < 5;j++){
			for(int i = 0;i < name.length();i++){
				 System.out.print(nameArray[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void dialogViewer()
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, "+ name +"!");
		System.exit(0);
	}
	
	public void openDialogBox()
	{
		String name = JOptionPane.showInputDialog("What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name +". I'm afraid I can't do that.");
		System.exit(0);
	}
	
	public void webDialogViewer() 
	{
		try{
			URL imageLocation = new URL("https://i.amz.mshcdn.com/DgX-60lbRtmESGxeFX_k-vCemUk=/fit-in/1200x9600/http%3A%2F%2Fmashable.com%2Fwp-content%2Fuploads%2F2012%2F10%2Fdancing_banana.gif");
			JOptionPane.showMessageDialog(null, "Hello", "Title",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
			System.exit(0);
		}catch(Exception e){System.out.println("Oh nooo");}
	}
	
	public static void main(String[] args)
	{ 
		Exercises test = new Exercises();
		//test.NamePrinter("Paddy is the Greatest!");
		//test.printNameLarge("The Quick Brown Fox Jumped Over The Lazy Dog");
		//test.dialogViewer();
		//test.webDialogViewer();
		test.openDialogBox();

		
	}
	
}
