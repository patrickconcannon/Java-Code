
/**
 * Car Class 
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

public class Car extends Vehicle{

	private int passengerNumber;
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and passes aUniqueRegisterNumber, aTotalRentalDays, and anOwnerName to the 
	 * super constructor of the Vehicle class for them to be initialized. It then 
	 * initializes its own unique parameter, namely, passengerNumber.
	 * 
	 * @param aUniqueRegisterNumber this is the unique ID number for this Car object.
	 * @param aPassengerNumber this is the number of passengers of this Car object.
	 * @param aRentalCostPerDay the rent cost for this Car per day.
	 * @param aTotalRentalDays the total number of days that the Car has been rented for.
	 * @param anOwnerName the name of the owner of the Car.
	 */
	public Car(int aUniqueRegisterNumber, int aPassengerNumber, int aRentalCostPerDay, 
			int aTotalRentalDays, String anOwner){

		super(aUniqueRegisterNumber, aRentalCostPerDay, aTotalRentalDays, anOwner);
		passengerNumber = aPassengerNumber;
	}
	
	/**
	 * This method will return a String of all the details of the implicit
	 * parameter i.e. the calling Car object. 
	 * @return String with all of the variable details of the Car instance.
	 */
	public String getVehicleDetails(){
		return super.getVehicleID() + 
				" " + this.getPassengerNumber() +
				" " + super.getRentalCostPerDay() +
				" " + super.getTotalRentalDays() +
				" " + super.getOwner();
	}
	
	/**
	 * This method will return the passenger number of this Car.
	 * @return passengerNumber Will return an integer value for passengerNumber.
	 */
	public int getPassengerNumber(){
		return passengerNumber;
	}
	
	/**
	 * This method will return the total income for this Vehicle
	 * @return rentPerDay * totalRentalDays the rent generated from renting this Car.
	 */
	public int getIncome(){
		return super.getRentalCostPerDay() * super.getTotalRentalDays();
	}
	
}
