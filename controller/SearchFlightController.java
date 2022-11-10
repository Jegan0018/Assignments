package controller;

import java.util.ArrayList;

import model.Routes;
import view.SearchFlightView;

public class SearchFlightController {

	private SearchFlightView searchFlightView;

	public SearchFlightController(SearchFlightView searchFlightView) {
		this.searchFlightView=searchFlightView;
	}

	public void searchFlights(String source, String destination,String date, ArrayList<Routes> routesList) {
		for (int index = 0; index < routesList.size(); index++) {
			Routes list = (Routes) routesList.get(index);
			if (source == list.getSource() && destination == list.getDestination()) {
				System.out.println("Flight Number :" + list.getFlightNumber());
				System.out.println("Price :" + list.getPrice());
				System.out.println("Flight Name :" + list.getFlightName());
				System.out.println("Departure Time :" + list.getDepartureTime());
				System.out.println("Arrival Time :" + list.getArrivalTime());
				System.out.println("seats :" + list.getSeats());
				System.out.println("******************");
			}
		}
	}
	
	
	
}
