package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Routes;

public class AdminView {
	static ArrayList<Routes> routesList = new ArrayList<Routes>();
	private Scanner scanner = new Scanner(System.in);
	public void adminDisplay() {
		routesList.add(new Routes(2345,100.0,"Kolkatta Airways","1.00","11.00",10,"Chennai","Kolkata"));
		routesList.add(new Routes(2346,100.0,"Delhi Airways","23.00","05.30",10,"Chennai","Delhi"));
		routesList.add(new Routes(2347,100.0,"Kovai Airways","23.00","05.00",10,"Chennai","Ahmedabad"));
		
		int input;
		try {
			do {
				menu();
				input = scanner.nextInt();
				switch(input) {
				case 1:
					new CreateFlightRoutesAdmin().createRoutes(routesList);
					break;
				case 2:
					new SearchFlightView().searchFlight(routesList);
					break;
				case 3:
					new ListTicketsBooked().listTickets();
					break;
				case 4:
					new SearchPassenger().searchPassenger();
					break;
				default :
					break;
				}
			} while (input != 6);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	private void menu() {
		System.out.println("Welcome Admin");
		System.out.println("Press 1 to CreateFlightRoutes");
		System.out.println("Press 2 to SearchFlights");
		System.out.println("Press 3 to ListTicketsBooked");
		System.out.println("Press 4 to SearchPassengerById");
		System.out.println("Press 5 to TicketStatusUsingPNRNumber");
	}

}
