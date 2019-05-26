/*
 *this class is in order to create object vehicle 
 * Student ID : 150116042
 * Student Name : Celil Mete
 */

public class Vehicle {
	private String plateNubmer;
	private int size;

	public Vehicle() {

	}

	public Vehicle(String plateNumber, int size) {
		
		this.plateNubmer = plateNumber;//put plate number in date field
		if (size != 1 && size != 2 && size != 4)//check if the size is valid 
			this.size = 1;						// if it is not make it equal to 1
		this.size = size;

	}

	public String getPlateNumber() {
		return this.plateNubmer;

	}

	public int getSize() {
		return size;
	}

	public String getVehicleInfo(){		
			return "Vehicle Info \nPlate Number : " + getPlateNumber() + " \nSize : " + getSize() ; 							
	}
	

}
