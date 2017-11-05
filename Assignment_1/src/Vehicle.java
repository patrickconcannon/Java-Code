import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Vehicle Class 
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

public class Vehicle implements RentItem{
	
	// Vehicle attributes.
	private int uniqueRegisterNumber;
	private int totalRentalDays;
	private int rentalCostPerDay;
	
	// This variable will only be used within the Vehicle super-class
	// and not the sub-classes. It will be used to keep track of the income
	// from every vehicle.
	private int totalIncomeFromAllVehicles;
	
	private String owner;
	
	// Input file and output file for property details to be printed to.
	private String inputFile = "inputVehicleFile.txt";
	private String outputFile = "outputVehicleFile.txt";
	
	// Vehicle Types - used when choosing which sub-class to create.
	private static final int CAR = 1;
	private static final int TRUCK = 2;
	
	// Default number of rental days used to test rentVehicle method
	private static final int DEFAULT_NUMBER_OF_RENTAL_DAYS = 10;
	
	// ArrayList containing instances of the different vehicle types 
	private ArrayList<Car> carList = new ArrayList<Car>(); 
	private ArrayList<Truck> truckList = new ArrayList<Truck>(); ;
	
	
	
	// Empty constructor
	public Vehicle(){}
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and initializes them.
	 * @param aUniqueRegisterNumber this is the unique ID number for this Vehicle object.
	 * @param aRentalCostPerDay the rent cost for this Vehicle per day
	 * @param aTotalRentalDays the total number of days that the Vehicle has been rented for
	 * @param anOwner the name of the owner of the Vehicle
	 */
	public Vehicle(int aUniqueRegisterNumber, int aRentalCostPerDay, 
			int aTotalRentalDays, String anOwner){
		
		uniqueRegisterNumber = aUniqueRegisterNumber;
		rentalCostPerDay = aRentalCostPerDay;
		totalRentalDays = aTotalRentalDays;
		owner = anOwner;
	}
	
	/**
	 * This method will scan the input file and fill in the appropriate ArrayLists.
	 * It will read one line at a time and store it in the String currentLine. This 
	 * String will then be split into its various elements which will then be used
	 * as parameters for constructors for the various Vehicle sub-types.
	 * 
	 */
	public void readInputVehicleFile(){
		
		Scanner inputScanner = null;
		FileReader inputReader = null;
		
		try{
			inputReader = new FileReader(inputFile);
			inputScanner = new Scanner(inputReader);
			while(inputScanner.hasNextLine()) {
				String currentLine = inputScanner.nextLine();
				
				// Split the string at each space character
				String[] splitStr = currentLine.split("\\s+");

				// Check their propertyID's to see what type they are first.
				if(Integer.parseInt(splitStr[0].substring(0, 1)) == CAR){
					carList.add(new Car(Integer.parseInt(splitStr[0]),
							Integer.parseInt(splitStr[1]),
							Integer.parseInt(splitStr[2]),
							Integer.parseInt(splitStr[3]),
							splitStr[4])
					);
				}else if((Integer.parseInt(splitStr[0].substring(0, 1)) == TRUCK)){
					truckList.add(new Truck(Integer.parseInt(splitStr[0]),
							Integer.parseInt(splitStr[1]),
							Integer.parseInt(splitStr[2]),
							Integer.parseInt(splitStr[3]),
							splitStr[4])
					);
				}else{
					System.out.println("Unknown property type!");
				}		
			}
		}catch(Exception ex) { 
			System.out.println("exception "+ex.getMessage()+" caught");
			}finally{
				//Close the scanner object
				inputScanner.close();
				}
	}
	
	/**
	 * This method is split into two parts.
	 * 
	 * In the first part, the method will initialize three ArrayLists,
	 * one for each of the sub-classes. It will then add three instances 
	 * of each sub-class to their corresponding ArrayList. 
	 * 
	 * The method rentProperty will then be called three times on each 
	 * instance.This results in an increase in the variable totalRentalDays 
	 * of each object by DEFAULT_NUMBER_OF_RENTAL_DAYS in the three 
	 * ArrayLists. 
	 * 
	 */
	public void fillInVehicles(){
		int carCounter = 0; 
		int truckCounter = 0; 
		// Used to create random parameters for the objects created below
		Random randomVariable = new Random();
		// Add three instances of the each sub-classes to their corresponding ArrayList. 
		for(int i = 0; i < 3; i++){		
	
			carList.add(new Car(Integer.parseInt("1" + carCounter++), randomVariable.nextInt(5),
					randomVariable.nextInt(5), 0, ("Car_Name_"+i)));
			
			truckList.add(new Truck(Integer.parseInt("2" + truckCounter++), randomVariable.nextInt(500),
					randomVariable.nextInt(5), 0, "Truck_Name_"+i));
			
			// For each added instance, call rentItem() on it three times
			for(int j = 0; j < 3; j++){
				carList.get(i).rentItem(DEFAULT_NUMBER_OF_RENTAL_DAYS);
				truckList.get(i).rentItem(DEFAULT_NUMBER_OF_RENTAL_DAYS);
				
			}
		}
	}
	
	/**
	 * This method prints the details of all of the properties currently available.
	 * It does this by calling the getPropertyDetails() method on each instance 
	 * currently held by the Property super-class. The various type instances will 
	 * return a corresponding formatString of all of their details. These Strings will
	 * then be concatenated together to form the allPropertiesFormatString. This String
	 * will contain all of the details for all properties, organized in such a way
	 * as to show these details in a formatted way.
	 * 
	 * The second half of the method, prints this allPropertiesFormatString to an output
	 * file called outputPropertyFile.txt
	 */
	public void printAllVehicles(){
		
		String carFormatString = "";
		String truckFormatString = "";
		
		for(Car car : carList){
			carFormatString += car.getVehicleDetails() + "\n";
		}
		for(Truck truck : truckList){
			truckFormatString += truck.getVehicleDetails() + "\n";
		}
		// Concatenate all three strings together
		String allVehiclesFormattedString = carFormatString + truckFormatString;
		
		// Out put the details of all properties to outputPropertyFile.txt
		PrintWriter outputFileWriter = null;
		try{
			outputFileWriter = new PrintWriter(outputFile);
			outputFileWriter.print(allVehiclesFormattedString);
			outputFileWriter.close();
			}catch(Exception ex){
				System.out.println("exception " + ex.getMessage() + "caught");
				}finally{
					outputFileWriter.close();
				}
	}
	
	/**
	 * Here I'm using an enhanced for loop rather than the traditional for loop
	 * because their could be an uneven number of properties within each of the 
	 * ArrayLists -- even though in this example their isn't.
	 * 
	 */
	public int calculateTotalIncome(){
		
		for(Car car : carList){
			totalIncomeFromAllVehicles += car.getIncome();
		}
		for(Truck truck : truckList){
			totalIncomeFromAllVehicles += truck.getIncome();
		}
		return totalIncomeFromAllVehicles;
	}
	
	/**
	 * This method takes in the number of days that the implicit vehicle
	 * is rented for, and adds it to the total number of rental
	 * days for this vehicle minus one free day for each time it is rented.
	 * @param rentalDays
	 */
	public void rentItem(int rentalDays){
		totalRentalDays += (rentalDays - 1); 
	}

	/** 
	 * This method prints the details of all of the vehicles currently available to the console.
	 * It does this by calling the getVehicleDetails() method on each instance 
	 * currently held by the Vehicle super-class. The various type instances will 
	 * return a corresponding formatString of all of their details. These Strings will
	 * then be concatenated together to form the allVehiclesFormattedString. This String
	 * will contain all of the details for all vehicles, organized in such a way
	 * as to show these details in a formatted way.
	 * 
	 * The second half of the method, prints this allVehiclesFormattedString to an output
	 * file called outputVehicleFile.txt
	 */
	public void printAllVehiclesToConsole(){
		
		String carFormatString = "\nAll Cars\n----------\n";
		String truckFormatString = "\nAll Trucks\n--------------\n";
		
		// Iterate through each ArrayList, and add details of each instance to 
		// corresponding format String.
		for(Car car : carList){
			carFormatString += car.getVehicleDetails() + "\n";
		}
		for(Truck truck : truckList){
			truckFormatString += truck.getVehicleDetails() + "\n";
		}
		
		// Concatenate all three strings together
		String allPropertiesFormatString = carFormatString + truckFormatString;
			
		 //Print to console
		 System.out.println(allPropertiesFormatString);
		
	}
	
	
	  // Getter Methods
	
	/**
	 * This method will return the rental cost per day of each vehicle.
	 * @return rentPerDay Will return an integer value for rentalCostPerDay.
	 */
	public int getRentalCostPerDay(){
		return rentalCostPerDay;
	}
	
	/**
	 * This method will return the total number of days rented for the vehicle.
	 * @return totalRentalDays Will return an integer value for rentPerDay.
	 */
	public int getTotalRentalDays(){
		return totalRentalDays;
	}
	
	/**
	 * This method will return the owner's name for each vehicle.
	 * @return ownerName Will return a String value for ownerName.
	 */
	public String getOwner(){
		return owner;
	}
	
	/**
	 * This method will return the unique vehicle number, which is called
	 * the VehicleID in the second half of the assignment.
	 * @return uniqueRegisterNumber Will return a integer value for uniqueRegisterNumber.
	 */
	public int getVehicleID(){
		return uniqueRegisterNumber;
	}
}
