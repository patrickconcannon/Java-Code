
public interface RentItem {

	/**
	 * Take in the integer value rentalDays, and increase the total number
	 * of rental days for the implicit object i.e. the calling object.
	 * @param rentalDays must take in a integer value which it increase the total
	 * rental days by.
	 */
	public void rentItem(int rentalDays);
}
