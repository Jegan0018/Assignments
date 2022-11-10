package controller;

import java.util.ArrayList;

import model.Routes;
import view.CreateFlightRoutesAdmin;

public class CreateFlightRoutesController {

	private CreateFlightRoutesAdmin createRoutes;

	public CreateFlightRoutesController(CreateFlightRoutesAdmin createRoutes) {
		this.createRoutes=createRoutes;
	}

	public void createFlightRoutesController(int flightNumber, double price, String flightName, String departureTime,
			String arrivalTime, int seats, String source, String destination, ArrayList<Routes> arrayList) {
		arrayList.add(new Routes(flightNumber, price, flightName, departureTime, arrivalTime, seats,source,destination));
	}
	
	
}
