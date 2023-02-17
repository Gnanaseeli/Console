package Flight;
import java.util.Scanner;
class Flight {
		private int flightNumber;
		private String airlineName;
		private String source;
		private String destination;
		private int capacity;
		private int bookedSeats;
		
		public Flight(int flightNumber, String airlineName, String source, String destination, int capacity) {
			this.flightNumber = flightNumber;
			this.airlineName = airlineName;
			this.source = source;
			this.destination = destination;
			this.capacity = capacity;
			this.bookedSeats = 0;
		}
		
		public int getFlightNumber() {
			return flightNumber;
		}
		
		public void setFlightNumber(int flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getAirlineName() {
			return airlineName;
		}

		public void setAirlineName(String airlineName) {
			this.airlineName = airlineName;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public int getBookedSeats() {
			return bookedSeats;
		}

		public void setBookedSeats(int bookedSeats) {
			this.bookedSeats = bookedSeats;
		}

 
		public boolean checkAvailability(int seats) {
			return capacity - bookedSeats >= seats;
		}

 
		public void bookSeats(int seats) {
			if (checkAvailability(seats)) {
				bookedSeats += seats;
				System.out.println("Seats booked successfully for " + seats + " passengers");
			} else {
				System.out.println("Sorry, seats are not available");
			}
		}
}