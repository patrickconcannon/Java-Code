
/**
 * Villa Class 
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

public class Villa extends Property{

	private int roomServiceCostPerDay;
	private int luxuryTaxPerDay;
	
	/**
	 * The Main Constructor for this class takes in the parameters below,
	 * and passes aUniqueRegisterNumber, aRentPerDay, aTotalRentalDays, anOwnerName, 
	 * and aPostalAddress to the super constructor of the Property class for them
	 * to be initialized. It then initializes its own two unique parameters, namely, 
	 * roomServiceCostPerDay and luxuryTaxPerDay.
	 * 
	 * @param aUniqueRegisterNumber this is the unique ID number for this Villa object.
	 * @param aLuxuryTaxPerDay this specifies the luxury tax on this Villa per day.
	 * @param aRoomServiceCostPerDay this specifies the room service fee to be charged for this Villa.
	 * @param aRentPerDay the rent cost for this Villa per day.
	 * @param aTotalRentalDays the total number of days that the Villa has been rented for.
	 * @param anOwnerName the name of the owner of the Villa.
	 * @param aPostalAddress the postal address of the Villa.
	 */
	public Villa(int aUniqueRegisterNumber, int aRoomServiceCostPerDay, 
			int aLuxuryTaxPerDay, int aRentPerDay, int aTotalRentalDays,
			String anOwnerName, String aPostalAddress){
		
		super(aUniqueRegisterNumber, aRentPerDay, 
				aTotalRentalDays, anOwnerName, aPostalAddress);
		
		roomServiceCostPerDay = aRoomServiceCostPerDay;
		luxuryTaxPerDay = aLuxuryTaxPerDay;
	}
	
	/**
	 * This method will return a String of all the details of the implicit 
	 * parameter i.e. the calling Villa object. 
	 * @return String with all of the variable details of the Villa instance.
	 */
	public String getPropertyDetails(){
		return super.getUniqueRegisterNumber() + 
				" " + this.getRoomServiceCostPerDay() + " " + this.getLuxuryTaxPerDay() + 
				" " + super.getRentPerDay() + " " + super.getTotalRentalDays() +
				" " + super.getOwnerName() + " " + super.getPostalAddress();
	}
	
	//Getter Methods
	
	/**
	 * This method will get the room service cost per day value for this Villa 
	 * object.
	 * @return roomServiceCostPerDay this will return a integer value for the
	 * roomServiceCostPerDay.
	 */
	public int getRoomServiceCostPerDay(){
		return roomServiceCostPerDay;
	}
	
	/**
	 * This method will get the value for luxury tax per day for this Villa 
	 * object.
	 * @return luxuryTaxPerDay this will return a integer value for the
	 * luxuryTaxPerDay
	 */
	public int getLuxuryTaxPerDay(){
		return luxuryTaxPerDay;
	}
	
	/**
	 * This method will return the total income for this property. Note that Villas
	 * have additional charges added: a luxury tax and a room service charge are added each day. 
	 * @return totalRentalDays * (rentPerDay + luxuryTaxPerDay + roomSericeCostPerDay) 
	 */
	public int getIncome(){
		return  super.getTotalRentalDays() * (super.getRentPerDay() +
				this.getLuxuryTaxPerDay() + this.getRoomServiceCostPerDay());
	}
	
}
