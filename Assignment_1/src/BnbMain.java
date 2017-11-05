/**
 * BnbMain Class 
 * --------------
 * 
 * MSc Computer Science(Negotiated Learning) 
 * COMP47500 - Advanced Data Structures in Java
 * Assignment 1 and 2
 * 
 * @author PatrickConcannon Student ID: 04050986
 * 7th October 2017
 * 
 */
public class BnbMain {

	/**
	 * This method is to be used to test the Property and Vehicle Classes
	 * 
	 */
	public static void main(String[] args){
		Property p = new Property();
		Vehicle v = new Vehicle();
		
		/* Part A - Property class
		p.fillInProperties();
		p.printAllPropertiesToConsole();
		System.out.println("Total Income for all properties: " + p.calculateTotalIncome());
		*/
		
		/* Part B - Property class */
		p.readInputPropertyFile();
		p.printAllProperties();
		p.giveRentalProperty(); 
		
		p.printAllPropertiesToConsole(); // Can be used to show live update of values
		
		
		/* Part B  - Vehicle class
		v.readInputVehicleFile();
		v.printAllVehicles();
		v.printAllVehiclesToConsole();
		*/
	}
}
