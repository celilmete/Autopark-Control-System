/*
 * this class is in order to create object Ticket
 * Student ID : 150116042
 * Student Name : Celil Mete
 */

import java.util.Date;


public class Ticket {
	private Vehicle vehicle;
	private Date entryDate;
	private Date exitDate = null ;
	private double totalPrice;
	public static int numberOfTickets ;

	public Ticket(){
		numberOfTickets++;
	}

	public Ticket(Vehicle vehicle , Date entryDate ){
		this.vehicle = vehicle;	//put the vehicle in data field
		this.entryDate = entryDate; // put entry date in date field
		numberOfTickets++;
	}

	public double calculatePrice(double hourlyPrice , Date exitDate ){
		this.exitDate = exitDate;//	put the exit date in data field		//getTime returns with millisecond in order to make it hours divide it 
		double numberOfHoursD = (exitDate.getTime() - entryDate.getTime() ) / 1000 / 60 / 60.0 ;//calculate total hours in double 
		int numberOfHours = (int)Math.round(numberOfHoursD + 0.49); // round the double value to the number up and cast it to the integer
		double price = numberOfHours * hourlyPrice * vehicle.getSize() ;//Calculate the price
		totalPrice += price;//calculate total price
		return price; //return with the price value

	}

	public String getTicketInfo(){
		if (exitDate == null){// check if there is an exitDate
			return "Ticket Info" + "\n"//print the message if there is not an exitDate
					+ "Plate Number : " + vehicle.getPlateNumber() + "\n"
					+ "Entry:" + entryDate.toString() + "\n";
		}
		else
			return "Ticket Info" + "\n"	//print the message if there is an exitDate
			+ "Plate Number : " + vehicle.getPlateNumber() + "\n"
			+ "Entry : " + entryDate.toString() + "\n"
			+ "Exit : " + exitDate.toString() + "\n"
			+ "Hour : " +  (int)(Math.round((exitDate.getTime() - entryDate.getTime() ) / 1000 / 60 / 60.0 + 0.49)) + "\n"
			+ "Fee : " + getPrice();

	}

	public Vehicle getVehicle(){
		return this.vehicle;
	}

	public double getPrice(){
		return totalPrice;

	}
}
