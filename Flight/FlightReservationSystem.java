package Flight;

import java.util.Scanner;

public class FlightReservationSystem {
public static void main(String[] args) {
FlightReservationSystem flightReservation = new FlightReservationSystem();
FlightReservation1 flight= new FlightReservation1();
Scanner scanner = new Scanner(System.in);

    boolean done = false;
    while (!done) {
        System.out.println("Flight Reservation System Menu:");
        System.out.println("1. Add a flight");
        System.out.println("2. Display all flights");
        System.out.println("3. Book seats on a flight");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.print("Enter flight number: ");
                int flightNumber = scanner.nextInt();
                System.out.print("Enter airline name: ");
                String airlineName = scanner.next();
                System.out.print("Enter source: ");
                String source = scanner.next();
                System.out.print("Enter destination: ");
                String destination = scanner.next();
                System.out.print("Enter capacity: ");
                int capacity = scanner.nextInt();
                System.out.print("Enter Booked seats: ");
                int booked = scanner.nextInt();
                flight.addFlight(flightNumber, airlineName, source, destination, capacity,booked);
                break;
            case 2:
                flight.displayFlights();
                break;
            case 3:
                System.out.print("Enter flight number: ");
                flightNumber = scanner.nextInt();
                System.out.print("Enter number of seats to book: ");
                int seats = scanner.nextInt();
                flight.bookFlight(flightNumber, seats);
                break;
            case 4:
                done = true;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    scanner.close();
}
}