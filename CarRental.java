/* CarRental
 * @author=Ali
 * simple class for SWE211 course @ KSU to 
 * build jUnit test cases
 * 
 *  
 * This Class implements a Car Rental. There are a number of available cars (specified in the constructor). 
 * each time a car is rented, it is added to the list of rentedCars and the number of available cars decreases.
 *  A car can be returned by calling the method "returnCar" and the car will be removed from the rentedCars 
 *list and the number of available cars will increase.
 *  If number of available cars=0, it is not possible to rent a car.
 */

import java.util.ArrayList;


public class CarRental {
	
	private ArrayList<String> rentedCars; // list containing the rented cars
	private int noOfavailableCars; // number of available cars( cars that can be rented)

	// Constructor to define the ArrayList and set up the number of available cars
	public CarRental(int availableCars) {
		rentedCars = new ArrayList<String>();
		this.noOfavailableCars = availableCars; // Cars available to be rented to customers
	}

	// Return the number of cars that is available( not rented yet)
	public int getNoOfavailableCars() {
		return noOfavailableCars;
	}

	// Rent a car (if the Company still have available cars it will rent one and return succeed, else it will return failed)
	public String RentCar(String CarName) {
		if (noOfavailableCars > 0) {
			rentedCars.add(CarName);
			noOfavailableCars--;
			return "Succeedfghfghgmghjghj";
		} else
			return "Failed";

	}

	/*
	 * return a rented car, if the car doesn't exist in the rented car Array
	 * list, it will throw (IllegalStateException)
	 */
	public void returnCar(String carName) {
		if (isCarRented(carName)) {
			rentedCars.remove(carName);
			noOfavailableCars++; // Increase No. of available cars
		} else
			throw new IllegalStateException(
					"Car Doesn't Exist in Rented Cars list!!");
	}

	// Return True if the car was rented, and False otherwise.
	public boolean isCarRented(String carName) {
		if (rentedCars.contains(carName))
			return true;
		else
			return false;

	}

	// Return the latest car rented , if No car was rented (rentedCars is empty), return null.
	public String getLatestRentedCar() {
		try {
			return rentedCars.get(rentedCars.size() - 1);
		} catch (ArrayIndexOutOfBoundsException ex) {
			return null;
		}
	}

	// Convert the Arraylist into Array, and return the list of rented cars as an Array.
	public Object[] returnArrayOfCars() {
		return rentedCars.toArray();
	}

}
