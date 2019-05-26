/*
 * this class includes the main method and in order to test other classes
 * Student ID : 150116042
 * Student Name : Celil Mete
 */

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create 5 date object that will be the entry dates
		Date dateCar1 = new Date();

		Date dateCar2 = new Date();
		dateCar2.setTime(dateCar1.getTime() + 3600000); // add 1 hour to the
														// first one and make it
														// second
		Date dateCar3 = new Date();
		dateCar3.setTime(dateCar2.getTime() + 3600000); // ....
		Date dateCar4 = new Date();
		dateCar4.setTime(dateCar3.getTime() + 3600000);
		Date dateCar5 = new Date();
		dateCar5.setTime(dateCar4.getTime() + 3600000);

		// Create 5 dates that will be the exit dates
		Date dateCarEx1 = new Date();
		dateCarEx1.setTime(dateCar1.getTime() + 3600000 * 2); // add them random
																// random hours
		Date dateCarEx2 = new Date();
		dateCarEx2.setTime(dateCar2.getTime() + 3600000 * 3); // ...
		Date dateCarEx3 = new Date();
		dateCarEx3.setTime(dateCar3.getTime() + 3600000 * 5);
		Date dateCarEx4 = new Date();
		dateCarEx4.setTime(dateCar4.getTime() + 3600000 * 5);

		// create 5 vehicles
		Vehicle vehicle1 = new Vehicle("34CSE1141", 4);
		Vehicle vehicle2 = new Vehicle("34CSE1142", 2);
		Vehicle vehicle3 = new Vehicle("34CSE1143", 1);
		Vehicle vehicle4 = new Vehicle("34CSE1144", 2);
		Vehicle vehicle5 = new Vehicle("34CSE1145", 4);
		// create a carPark
		CarPark carPark = new CarPark(10, 5);
		// try to park the 5 vehicles invoking the parkVehicle method of CarPark
		Ticket ticket1 = carPark.parkVehicle(vehicle1, dateCar1);
		Ticket ticket2 = carPark.parkVehicle(vehicle2, dateCar2);
		Ticket ticket3 = carPark.parkVehicle(vehicle3, dateCar3);
		Ticket ticket4 = carPark.parkVehicle(vehicle4, dateCar4);
		Ticket ticket5 = carPark.parkVehicle(vehicle5, dateCar5);

		System.out.println("");
		// invoke the print vehicle list method of CarPark
		carPark.printVehicleList();
		System.out.println("");
		// 2 vehicles exits invoking exitVehicle method of CarPark
		carPark.exitVehicle(ticket1, dateCarEx1);
		carPark.exitVehicle(ticket2, dateCarEx2);
		System.out.println("");
		// invoke the print vehicle list method of CarPark
		carPark.printVehicleList();
		System.out.println();
		// 2 vehicles exits invoking exitVehicle method of CarPark
		carPark.exitVehicle(ticket3, dateCarEx3);
		carPark.exitVehicle(ticket4, dateCarEx4);
		System.out.println("");
		// print total income and tickets
		System.out.println("Total Income: " + carPark.getTotalInCome());
		System.out.println();
		System.out.println("Total number of Tickets: " + Ticket.numberOfTickets);
		System.out.println("");
		// print tickets invoking pringTickets method of CarPark
		carPark.printTickets();
	}

}
