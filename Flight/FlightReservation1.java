package Flight;
class FlightReservation1 {
    private Flight[] flights = new Flight[20];
    private int numFlights;

    // Constructor to initialize the FlightReservation object
    public FlightReservation1(int maxFlights) {
   
      
        
    }

	public FlightReservation1() {
	}


    public void addFlight(int flightNumber, String airlineName, String source, String destination, int capacity,int bookSeats) {
        flights[numFlights] = new Flight(flightNumber, airlineName, source, destination, capacity);
        numFlights++;
        System.out.println("Flight " + flightNumber + " added successfully");
    }
    

    // Method to display all flights in the system
    public void displayFlights() {
        if (numFlights == 0) {
            System.out.println("No flights found");
            return;
        }
        System.out.println("Flight Number\tAirline\tSource\tDestination\tCapacity\tBooked Seats");
        for (int i = 0; i < numFlights; i++) {
            System.out.println(flights[i].getFlightNumber() + "\t" + flights[i].getAirlineName() + "\t" +
                    flights[i].getSource() + "\t" + flights[i].getDestination() + "\t" +
                    flights[i].getCapacity() + "\t" + flights[i].getBookedSeats());
}
}

// Method to book seats on a flight
public void bookFlight(int flightNumber, int seats) {
    Flight flight = getFlightByNumber(flightNumber);
    if (flight == null) {
        System.out.println("Flight " + flightNumber + " not found");
        return;
    }
    flight.bookSeats(seats);
}

// Method to get a flight object by its flight number
private Flight getFlightByNumber(int flightNumber) {
    for (int i = 0; i < numFlights; i++) {
        if (flights[i].getFlightNumber()==(flightNumber)) {
            return flights[i];
        }
    }
    return null;
}
}