
public class Converter {
	
	private final double CONVERSION_FACTOR;
	
	/**
	 * Constructs a converter that can convert between two units.
	 * @param aConversionFactor the factor by which to multiply
	 * to convert to the target unit
	 */
	public Converter(double aConversionFactor){
		CONVERSION_FACTOR = aConversionFactor;
	}
	
	/**
	 * Converts from a source measurement to a target measurement.
	 * @param fromMeasurement the measurement
	 * @return the input value converted to the target unit
	 */
	public double convertTo(double fromMeasurement){
		return (fromMeasurement * CONVERSION_FACTOR) * 1000;
	}
	
	/**
	 * Converts from a target measurement to a source measurement.
	 * @param toMeasurement the target measurement
	 * @return the value whose conversion is the target measurement 
	 */
	public double convertFrom(double toMeasurement){
		return (toMeasurement / CONVERSION_FACTOR) / 1000;
	}
	
	public static void main(String[] args){
		Converter milesToMeters = new Converter(1.609);
		double meters = 1000; 
		double miles = milesToMeters.convertFrom(meters);
		System.out.println(milesToMeters.convertTo(miles)); // return miles in meters
		System.out.println(miles);
		
	}

}
