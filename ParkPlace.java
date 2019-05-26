/*
 *this class is in order to create object ParkPlace 
 * Student ID : 150116042
 * Student Name : Celil Mete
 */

public class ParkPlace {

	private Vehicle vehicle;
	private int size;

	public ParkPlace() {

	}

	public ParkPlace(Vehicle vehicle) {

		this.vehicle = vehicle;//put vehicle in date field
		this.size = vehicle.getSize();//let parkPlace s size to be vehicle s size 
	}

	public int getSize() {
		return size;//return with the size
	}

	public Vehicle getVehicle() {
		return vehicle;//return with the vehicle
	}

}
