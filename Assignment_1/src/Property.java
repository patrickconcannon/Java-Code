import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Property Class 
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
public class Property implements RentItem{
	
	// Property attributes.
	private int uniqueRegisterNumber;
	private int rentPerDay;
	private int totalRentalDays;
	
	// This variable will only be used within the Property super-class
	// and not the sub-classes. It will be used to keep track of the income
	// from every property.
	private int totalIncomeFromAllProperties; 	 
	
	private String ownerName;
	private String postalAddress;
	
	// Input file and output file for property details to be printed to.
	private String inputFile = "inputPropertyFile.txt";
	private String outputFile = "outputPropertyFile.txt";
	
	// Property Types - used when choosing which sub-class to create.	
	private static final int APARTMENT = 1;
	private static final int HOUSE = 2;
	private static final int VILLA = 3;
	
	// Default number of rental days used to test rentProperty method
	private static final int DEFAULT_NUMBER_OF_RENTAL_DAYS = 10;

	// ArrayList containing instances of the different property types 
	private ArrayList<House> houseList = new ArrayList<House>();
	private ArrayList<Apartment> apartmentList = new ArrayList<Apartment>(); 
	private ArrayList<Villa> villaList = new ArrayList<Villa>(); 
	
	// Empty constructor
	public Property(){}
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and initializes them.
	 * @param aUniqueRegisterNumber this is the unique ID number for this Property object
	 * @param aRentPerDay the rent cost for this Property per day
	 * @param aTotalRentalDays the total number of days that the Property has been rented for
	 * @param anOwnerName the name of the owner of the Property
	 * @param aPostalAddress the postal address of the Property
	 */
	public Property(int aUniqueRegisterNumber, int aRentPerDay, 
			int aTotalRentalDays, String anOwnerName, String aPostalAddress){
		
		uniqueRegisterNumber = aUniqueRegisterNumber;
		rentPerDay = aRentPerDay;
		totalRentalDays = aTotalRentalDays;
		ownerName = anOwnerName;
		postalAddress = aPostalAddress;
	}
	
	/**
	 * 
	 * This method will scan the input file and fill in the appropriate ArrayLists.
	 * Reading one line at a time it will store each line as the String currentLine. 
	 * This String will then be split into substrings which will then be used
	 * as parameters for the constructors of the various Property sub-types.
	 * 
	 */
	public void readInputPropertyFile(){
		
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
				if(Integer.parseInt(splitStr[0].substring(0, 1)) == APARTMENT){
					apartmentList.add(new Apartment(Integer.parseInt(splitStr[0]),
							Integer.parseInt(splitStr[1]),
							Integer.parseInt(splitStr[2]),
							Integer.parseInt(splitStr[3]),
							Integer.parseInt(splitStr[4]),
							splitStr[5],splitStr[6])
					);
				}else if(Integer.parseInt(splitStr[0].substring(0, 1)) == HOUSE){
					houseList.add(new House(Integer.parseInt(splitStr[0]),
							Integer.parseInt(splitStr[1]),
							Integer.parseInt(splitStr[2]),
							Integer.parseInt(splitStr[3]),
							Integer.parseInt(splitStr[4]),
							splitStr[5],splitStr[6])
					);
				}else if((Integer.parseInt(splitStr[0].substring(0, 1)) == VILLA)){
					villaList.add(new Villa(Integer.parseInt(splitStr[0]),
							Integer.parseInt(splitStr[1]),
							Integer.parseInt(splitStr[2]),
							Integer.parseInt(splitStr[3]),
							Integer.parseInt(splitStr[4]),
							splitStr[5],splitStr[6])
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
	 * 
	 * This method takes in the String allPropertiesFormattedString, which should contain
	 * the details of all the properties currently held by the Property object. It
	 * will then proceed to print these details to an output text file.
	 * @param allPropertiesFormattedString this is the String that contains all details
	 * of all properties
	 */
	public void printAllProperties(){
		
		String houseFormatString ="";
		String apartmentFormatString = "";
		String villaFormatString = "";
		
		for(Apartment apartment : apartmentList){
			apartmentFormatString += apartment.getPropertyDetails() + "\n";
		}
		for(House house : houseList){
			houseFormatString += house.getPropertyDetails() + "\n";
		}
		for(Villa villa : villaList){
			villaFormatString += villa.getPropertyDetails() + "\n";
		}
		// Concatenate all three strings together
		String allPropertiesFormattedString = apartmentFormatString + houseFormatString  + villaFormatString;
		
		// Out put the details of all properties to outputPropertyFile.txt
		PrintWriter outputFileWriter = null;
		try{
			outputFileWriter = new PrintWriter(outputFile);
			outputFileWriter.print(allPropertiesFormattedString);
			outputFileWriter.close();
			}catch(Exception ex){
				System.out.println("exception " + ex.getMessage() + "caught");
				}finally{
					outputFileWriter.close();
				}
	}

	/**
	 * 
	 * This method will read in, through a GUI, a propertyID and a number of RentalDays.
	 * Each property ID is unique and it is structured in two parts. The first number of 
	 * the ID contains the propertyType i.e. Apartment, House, or Villa. The second contains
	 * the ID number of that sub-type. Using the propertyID, it will set the correct ArrayList,
	 * and then locate the type of Property. Then it will locate the individual 
	 * Property in that sub-type, and call the RentItem method on it. This will increase that 
	 * propertie's total number of Rental Days.
	 */
	public void giveRentalProperty(){
		
		int FRAME_WIDTH = 400; 
		int FRAME_HEIGHT = 100;
	      
		JFrame frame = new JFrame();
		//Components
		JTextField propertyIDField = new JTextField(5);
		JTextField rentalDayField = new JTextField(5);
		JButton button = new JButton("OK");
		JPanel infoPanel = new JPanel();
		
		infoPanel.add(new JLabel("PropertyID:"));
		infoPanel.add(propertyIDField);
		infoPanel.add(new JLabel("Rental Days:"));
		infoPanel.add(rentalDayField);
		infoPanel.add(button);
		
		// Create a spacer between the two text fields
		infoPanel.add(Box.createHorizontalStrut(15)); 
		frame.add(infoPanel);
		
		//This listener will accesses the propertyIDField and rentalDay Field
		//from the surrounding block.
		class AddListener implements ActionListener{
			public void actionPerformed(ActionEvent event){
				
				//check to see if content has been entered
				//If it hasn't warn user.
				if(propertyIDField.getText().isEmpty() || rentalDayField.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "You didn't input all values", "Value Missing!",
							JOptionPane.WARNING_MESSAGE);		
				}else{
					//If it has, continue.
					int propertyType = Integer.parseInt(propertyIDField.getText().substring(0,1));
					int propertyID = Integer.parseInt(propertyIDField.getText().substring(1));
					int rentalDays = Integer.parseInt(rentalDayField.getText());
					
					if(propertyType == APARTMENT){
						apartmentList.get(propertyID).rentItem(rentalDays);
						System.out.println(apartmentList.get(propertyID).getTotalRentalDays());
					}else if(propertyType == HOUSE){
						houseList.get(propertyID).rentItem(rentalDays);
					}else if(propertyType == VILLA){
						villaList.get(propertyID).rentItem(rentalDays);
					}
					printAllPropertiesToConsole(); // send info to console to show live update
					printAllProperties(); // update output file
				}
			}
		} 
		//Add Listener to the button object
		ActionListener listener = new AddListener();
		button.addActionListener(listener);
		//Display Frame
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 		
	}
	
	/**
	 * This method takes in the number of days that the implicit property
	 * is rented for, and adds it to the total number of rental
	 * days for this property. 
	 * @param rentalDays
	 */
	public void rentItem(int rentalDays){
		totalRentalDays += rentalDays;
	}
	
	/**
	 * 
	 * This method will run through each property held by this object and
	 * ask each sub-class instance to return their unique income values. It
	 * will then add this to the total rent value held within the super class
	 * giving the Total Income for all properties held.
	 * Here I'm using an enhanced for loop rather than the traditional for loop
	 * because their could be an uneven number of properties within each of the 
	 * ArrayLists -- even though in this example their isn't.
	 * @return totalIncomeFromAllProperties the total income taken by all Properties
	 */
	public int calculateTotalIncome(){

		for(Apartment apartment : apartmentList){
			totalIncomeFromAllProperties += apartment.getIncome();
		}
		for(House house : houseList){
			totalIncomeFromAllProperties += house.getIncome();
		}
		for(Villa villa : villaList){
			totalIncomeFromAllProperties += villa.getIncome();
		}
		return totalIncomeFromAllProperties;
	}
		
	
	/*
	 * PART A Methods
	 * 
	 * Please note that the printAllProperties method from part A is retained
	 * but renamed printAllPropertiesToConsole(). This allow's the user to see 
	 * the totalRentalDays when using the giveRentalProperty() method.
	 */
	
	/** NOTE: THIS METHOD IS FROM PART A 
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
	public void fillInProperties(){

		// Used to create random parameters for the objects created below
		Random randomVariable = new Random();
		int apartmentCounter = 0; 
		int houseCounter = 0;
		int villaCounter = 0;
		// Add three instances of the each sub-classes to their corresponding ArrayList. 
		for(int i = 0; i < 3; i++){		
	
			apartmentList.add(new Apartment(Integer.parseInt("1" + apartmentCounter++), randomVariable.nextInt(5),
					randomVariable.nextInt(5),randomVariable.nextInt(5),
					0, "Apartment_Name_"+i,"Apartment_Address_"+i));
			
			houseList.add(new House(Integer.parseInt("2" + houseCounter++), randomVariable.nextInt(5),
					randomVariable.nextInt(5),randomVariable.nextInt(5),
					0, "House_Name_"+i,"House_Address_"+i));
			
			villaList.add(new Villa(Integer.parseInt("3" + villaCounter++), randomVariable.nextInt(5),
					randomVariable.nextInt(5),randomVariable.nextInt(5),
					0, "Villa_Name_"+i,"Villa_Address_"+i));
			
			// For each added instance, call rentProperty() on it three times
			for(int j = 0; j < 3; j++){
				apartmentList.get(i).rentProperty(DEFAULT_NUMBER_OF_RENTAL_DAYS);
				houseList.get(i).rentProperty(DEFAULT_NUMBER_OF_RENTAL_DAYS);
				villaList.get(i).rentProperty(DEFAULT_NUMBER_OF_RENTAL_DAYS);
			}
		}
	}
	
	/** NOTE: THIS METHOD IS FROM PART A
	 * This method prints the details of all of the properties currently available to the console.
	 * It does this by calling the getPropertyDetails() method on each instance 
	 * currently held by the Property super-class. The various type instances will 
	 * return a corresponding formatString of all of their details. These Strings will
	 * then be concatenated together to form the allPropertiesFormattedString. This String
	 * will contain all of the details for all properties, organized in such a way
	 * as to show these details in a formatted way.
	 * 
	 * The second half of the method, prints this allPropertiesFormattedString to an output
	 * file called outputPropertyFile.txt
	 */
	public void printAllPropertiesToConsole(){
		
		String houseFormatString = "\nAll Houses\n----------\n";
		String apartmentFormatString = "\nAll Apartments\n--------------\n";
		String villaFormatString = "\nAll Villas\n----------\n";
		
		// Iterate through each ArrayList, and add details of each instance to 
		// corresponding format String.
		for(Apartment apartment : apartmentList){
			apartmentFormatString += apartment.getPropertyDetails() + "\n";
		}
		for(House house : houseList){
			houseFormatString += house.getPropertyDetails() + "\n";
		}
		for(Villa villa : villaList){
			villaFormatString += villa.getPropertyDetails() + "\n";
		}
		
		// Concatenate all three strings together
		String allPropertiesFormatString = apartmentFormatString + houseFormatString  + villaFormatString;
			
		 //Print to console. 
		 System.out.println(allPropertiesFormatString);
		
	}
		
	/** NOTE: THIS METHOD IS FROM PART A
	 * This method takes in the number of days that the implicit property
	 * is rented for, and adds it to the total number of rental
	 * days for this property. 
	 * @param rentalDays
	 */
	public void rentProperty(int rentalDays){
		totalRentalDays += rentalDays;
	}
	
	
	
	 // Getter Methods
	 
	/**
	 * Note: This method will return the unique register number
	 * of each property. Note that this unique number is split into PropertyType, the first digit,
	 * and PropertyID, the second part. PropertyType indicates the type of Property. PropertyID
	 * the property identification number within that type.
	 * @return uniqueRegisterNumber Will return an integer value for uniqueRegisterNumber.
	 */
	public int getUniqueRegisterNumber(){
		return uniqueRegisterNumber;
	}
	
	/**
	 * This method will return the rent per day
	 * of each property.
	 * @return rentPerDay Will return an integer value for rentPerDay.
	 */
	public int getRentPerDay(){
		return rentPerDay;
	}
	
	/**
	 * This method will return the total number of days rented for the property.
	 * @return totalRentalDays Will return an integer value for rentPerDay.
	 */
	public int getTotalRentalDays(){
		return totalRentalDays;
	}
	
	/**
	 * This method will return the owner's name for each property.
	 * @return ownerName Will return a String value for ownerName.
	 */
	public String getOwnerName(){
		return ownerName;
	}
	
	/**
	 * This method will return the postal address of
	 * each property.
	 * @return postalAddress Will return a String value for postalAddress.
	 */
	public String getPostalAddress(){
		return postalAddress;
	}
	
	/**
	 * This method will return the unique property number, which is called
	 * the PropertyID in the second half of the assignment.
	 * @return uniqueRegisterNumber Will return a integer value for uniqueRegisterNumber.
	 */
	public int getPropertyID(){
		return uniqueRegisterNumber;
	}
	
}

