/*
 * this class is in order to create object CarPark
 * Student ID : 150116042
 * Student Name : Celil Mete
 */


import java.util.Date;

public class CarPark {
	//create our date field
	private int capacity;
	public ParkPlace[] parkPlaceArray = new ParkPlace[20];
	public Ticket[] ticketArray = new Ticket[50];
	private double hourlyPrice;
	public int ticketCounter = 0;
	private int parkPlaceCounter = 0 ;
	//no argument constructor
	public CarPark() {

	}
	//create our constructor with arguments
	public CarPark(int capacity, int hourlyPrice) {
		//print a massage to the screen
		System.out.println("The car park with the capacity of " + capacity + " and the hourly price of " + hourlyPrice + " is created!");
		//let data fields take the values
		this.capacity = capacity;
		this.hourlyPrice = hourlyPrice;



	}
	
	public Ticket parkVehicle(Vehicle vehicle, Date entryDate) {

		//check if there is enough place for the vehicle
		if (this.capacity >= vehicle.getSize()) {
			parkPlaceArray[parkPlaceCounter] = new ParkPlace(vehicle); //create a new parkPlace 
			ticketArray[ticketCounter] = new Ticket(vehicle, entryDate);//create a new ticket
			ticketCounter++;
			parkPlaceCounter++;
			capacity = capacity - vehicle.getSize(); //update the capacity
			System.out.println("The vehicle with " + vehicle.getPlateNumber() + " plate number  is parked.");
			return ticketArray[ticketCounter - 1];//return with the ticket object
		} else { 
			System.out.println("Car park is full!. The vehicle with " + vehicle.getPlateNumber() + " plate number cannot be parked.");
			return null;
		}
	}

	public Vehicle exitVehicle(Ticket ticket, Date exitDate) {
		boolean isExist = false;
		for (int i = 0; i < ticketArray.length; i++) { //check if the ticket exists
			if (ticketArray[i] != null && ticket != null) {	//skip the nulls
				if (ticketArray[i].getVehicle().equals(ticket.getVehicle())) {
					isExist = true;
					break;
				}
			}

		}
		if (isExist) {
			capacity = capacity + ticket.getVehicle().getSize();//update the capacity
			double price = ticket.calculatePrice(hourlyPrice, exitDate);
			for (int i = 0; i < parkPlaceArray.length; i++) {//search for the parkPlace in the array
				if (parkPlaceArray[i] != null) {//skip nulls
					if (parkPlaceArray[i].getVehicle().equals(ticket.getVehicle())) {
						parkPlaceArray[i] = null; //make the parkPlace s value null
						System.out.println("The price for vehicle with " + ticket.getVehicle().getPlateNumber() + " plate number is: " + price);
						return ticket.getVehicle();	//return with the vehicle
					}
				}

			}
		}

		return null;
	}

	public double getTotalInCome() {
		double totalIncome = 0;
		for (int i = 0; i < ticketArray.length; i++) {
			if (ticketArray[i] != null) {//skip the nulls
				totalIncome += ticketArray[i].getPrice();//calculate the total income
			}
			

		}
		return totalIncome;
	}

	public void printVehicleList() {
		System.out.println("VEHICLE LIST");
		System.out.println("------------");
		for (int i = 0; i < parkPlaceArray.length; i++) {//Use for loop to search park places in the array
			if (parkPlaceArray[i] != null)
				System.out.println(parkPlaceArray[i].getVehicle().getVehicleInfo());
		}
		System.out.println("------------------------");

	}

	public void printTickets() {
		System.out.println("TICKETS");
		System.out.println("-------");
		for (int i = 0; i < ticketArray.length; i++) {
			if (ticketArray[i] != null) {
				System.out.println(ticketArray[i].getTicketInfo());
			}
		}
		System.out.println("---------------------");
	}

}
