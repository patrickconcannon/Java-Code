
/**
 * Apartment Class 
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

public class Apartment extends Property{

	private int storeyNumber;
	private int numberOfBeds;
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and passes aUniqueRegisterNumber, aRentPerDay, aTotalRentalDays, anOwnerName, 
	 * and aPostalAddress to the super constructor of the Property class for them
	 * to be initialized. It then initializes its own two unique parameters, namely, 
	 * storeyNumber and numberOfBeds.
	 * 
	 * @param aUniqueRegisterNumber this is the unique ID number for this Apartment object.
	 * @param aStoreyNumber this specifies the floor that this Apartment is on.
	 * @param aNumberOfBeds this specifies the number of beds in this Apartment.
	 * @param aRentPerDay the rent cost for this Apartment per day.
	 * @param aTotalRentalDays the total number of days that the Apartment has been rented for.
	 * @param anOwnerName the name of the owner of the Apartment.
	 * @param aPostalAddress the postal address of the Apartment.
	 */
	public Apartment(int aUniqueRegisterNumber, int aStoreyNumber,
			int aNumberOfBeds, int aRentPerDay, int aTotalRentalDays,
			String anOwnerName, String aPostalAddress){
		
		super(aUniqueRegisterNumber, aRentPerDay, 
				aTotalRentalDays, anOwnerName, aPostalAddress);
		
		storeyNumber = aStoreyNumber;
		numberOfBeds = aNumberOfBeds;
	}
	
	/**
	 * This method will return a String of all the details of the implicit
	 * parameter i.e. the calling Apartment object. 
	 * @return String with all of the variable details of the Apartment instance.
	 */
	public String getPropertyDetails(){
		return super.getUniqueRegisterNumber() + 
				" " + this.getStoreyNumber() + " " + this.getNumberOfBeds() + 
				" " + super.getRentPerDay() + " " + super.getTotalRentalDays() +
				" " + super.getOwnerName() + " " + super.getPostalAddress();
	}
	
	 // Getter Methods
	 
	/**
	 * This method will return the floor number of this Apartment.
	 * @return storeyNumber Will return an integer value for storeyNumber.
	 */
	public int getStoreyNumber(){
		return storeyNumber;
	}
	
	/**
	 * This method will return the number of beds in this Apartment.
	 * @return numberOfBeds Will return an integer value for numberOfBeds.
	 */
	public int getNumberOfBeds(){
		return numberOfBeds;
	}

	/**
	 * This method will return the total income for this property.
	 * @return rentPerDay * totalRentalDays
	 */
	public int getIncome(){
		return super.getRentPerDay() * super.getTotalRentalDays();
	}
	
}
