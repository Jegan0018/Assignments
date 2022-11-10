package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.SearchFlightController;
import model.Routes;

public class SearchFlightView {
	private Scanner scanner=new Scanner(System.in);
	private SearchFlightController searchFlight;
	SearchFlightView() {
		searchFlight=new SearchFlightController(this);
	}
	public void searchFlight(ArrayList<Routes> routesList) {
		String source,destination,date;
		System.out.println("Enter Departure At");
		source=scanner.nextLine();
		System.out.println("Enter Arrival At");
		destination=scanner.nextLine();
		System.out.println("Enter Date");
		date=scanner.nextLine();
		searchFlight.searchFlights(source,destination,date,routesList);
	}
}
