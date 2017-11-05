
/**
 * Truck Class 
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

public class Truck extends Vehicle{

	private int cargoWeight;
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and passes aUniqueRegisterNumber, aTotalRentalDays, and anOwnerName to the super 
	 * constructor of the Vehicle class for them to be initialized. It then initializes
	 * its own unique parameter, namely, cargoWeight.
	 * 
	 * @param aUniqueRegisterNumber this is the unique ID number for this Truck object.
	 * @param aCargoWeight this is cargo weight of this Truck object.
	 * @param aRentalCostPerDay the rent cost for this Truck per day.
	 * @param aTotalRentalDays the total number of days that the Truck has been rented for.
	 * @param anOwnerName the name of the owner of the Truck.
	 */
	public Truck(int aUniqueRegisterNumber, int aCargoWeight, int aRentalCostPerDay, 
			int aTotalRentalDays, String anOwner){
		
		super(aUniqueRegisterNumber, aRentalCostPerDay, aTotalRentalDays, anOwner);
		cargoWeight = aCargoWeight;
	}
	
	/**
	 * This method will return a String of all the details of the implicit
	 * parameter i.e. the calling Truck object. 
	 * @return String with all of the variable details of the Truck instance.
	 */
	public String getVehicleDetails(){
		return super.getVehicleID() + 
				" " + this.getCargoWeight() +
				" " + super.getRentalCostPerDay() +
				" " + super.getTotalRentalDays() +
				" " + super.getOwner();
	}
	
	 // Getter Methods
	 
	/**
	 * This method will return the cargo weight of this Truck.
	 * @return cargoWeight Will return an integer value for cargoWeight.
	 */
	public int getCargoWeight(){
		return cargoWeight;
	}
	
	/**
	 * This method will return the total income for this Vehicle, which amounts
	 * to the rent generated plus its cargo weight. 
	 * @return (rentPerDay * totalRentalDays) + cargoWeight
	 */
	public int getIncome(){
		return (super.getRentalCostPerDay() * super.getTotalRentalDays())
				+ this.getCargoWeight(); 
	}
}
