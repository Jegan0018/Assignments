package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CreateFlightRoutesController;
import model.Routes;

public class CreateFlightRoutesAdmin {
	CreateFlightRoutesController createRoutes;
	private Scanner scanner=new Scanner(System.in);
	
	public CreateFlightRoutesAdmin() {
		createRoutes = new CreateFlightRoutesController(this);
	}

	public void createRoutes(ArrayList<Routes> routesList) {
		int flightNumber;
		double price;
		String flightName;
		String departureTime;
		String arrivalTime;
		int seats;
		String source;
		String destination;
			System.out.println("Enter Flight Number");
			flightNumber=scanner.nextInt();
			System.out.println("Enter Price");
			price=scanner.nextDouble();
			System.out.println("Enter Flight Name");
			flightName=scanner.nextLine();
			scanner.next();
			System.out.println("Enter Departure Time");
			departureTime=scanner.nextLine();
			scanner.next();
			System.out.println("Enter Arrival Time");
			arrivalTime=scanner.nextLine();
			scanner.next();
			System.out.println("Enter Seats");
			seats=scanner.nextInt();
			System.out.println("Enter Source");
			source=scanner.nextLine();
			scanner.next();
			System.out.println("Enter Destination");
			destination=scanner.nextLine();
			createRoutes.createFlightRoutesController(flightNumber,price,flightName,departureTime,arrivalTime,seats,source,destination,routesList);
		
	}
}
