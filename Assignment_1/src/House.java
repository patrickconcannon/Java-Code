
/**
 * House Class 
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

public class House extends Property{

	private int totalNumberOfStories;
	private int clearingFee;
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and passes aUniqueRegisterNumber, aRentPerDay, aTotalRentalDays, anOwnerName, 
	 * and aPostalAddress to the super constructor of the Property class for them
	 * to be initialized. It then initializes its own two unique parameters, namely, 
	 * totalNumberOfStories and clearingFee.
	 * 
	 * @param aUniqueRegisterNumber this is the unique ID number for this House object.
	 * @param aTotalNumberOfStories this specifies the number of stories in this House.
	 * @param aClearingFee this specifies the clearing fee to be charged for this House
	 * when the rental period ends.
	 * @param aRentPerDay the rent cost for this House per day.
	 * @param aTotalRentalDays the total number of days that the House has been rented for.
	 * @param anOwnerName the name of the owner of the House.
	 * @param aPostalAddress the postal address of the House.
	 */
	public House(int aUniqueRegisterNumber, int aTotalNumberOfStories, 
			int aClearingFee, int aRentPerDay, int aTotalRentalDays,
			String anOwnerName, String aPostalAddress){
		
		super(aUniqueRegisterNumber, aRentPerDay,
				aTotalRentalDays, anOwnerName, aPostalAddress);
		
		totalNumberOfStories = aTotalNumberOfStories;
		clearingFee = aClearingFee;
	}
	
	/**
	 * This method will return a String of all the details of the implicit 
	 * parameter i.e. the calling House object. 
	 * @return String with all of the variable details of the House instance
	 */
	public String getPropertyDetails(){
		
		return super.getUniqueRegisterNumber() + 
				" " + this.getTotalNumberOfStories() + " " + this.getClearingFee() +
				" " + super.getRentPerDay() + " " + super.getTotalRentalDays() +
				" " + super.getOwnerName() + " " + super.getPostalAddress();
	}
	
	//Getter Methods
	
	/**
	 * This method will get the total number of stories for this House object.
	 * @return totalNumberOfStories this will return a integer value for the
	 * totalNumberOfStories.
	 */
	public int getTotalNumberOfStories(){
		return totalNumberOfStories;
	}
	
	/**
	 * This method will get the clearing fee value for this House object.
	 * @return clearingFee this will return a integer value for the
	 * clearingFee.
	 */
	public int getClearingFee(){
		return clearingFee;
	}
	
	/**
	 * This method will return the total income for this property. Note that Houses
	 * have an additional charge added: a clearing fee added at the end of the rental period. 
	 * @return (rentPerDay * totalRentalDays) + clearingFee 
	 */
	public int getIncome(){
		return (super.getRentPerDay() * super.getTotalRentalDays()) 
				+ this.getClearingFee();
	}
}
