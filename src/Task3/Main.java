package Task3;

import Task3.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Airplane> airplanes = new ArrayList<>();
        List<Flight> flights = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        List<Airport> airports = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an action:");
            System.out.println("1. Create a plane");
            System.out.println("2. Create a flight");
            System.out.println("3. Create a passenger");
            System.out.println("4. Create an airport");
            System.out.println("5. Show a schedule of flights");
            System.out.println("6. Buy a ticket");
            System.out.println("7. Cancel ticket");
            System.out.println("8. Calculation of income for a given period of time");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a model of aircraft:");
                    String model = scanner.next();
                    System.out.println("Enter the capacity of the aircraft:");
                    int capacity = scanner.nextInt();
                    Airplane airplane = new Airplane(airplanes.size() + 1, model, capacity);
                    airplanes.add(airplane);
                    System.out.println("Aircraft created!");
                    break;
                case 2:
                    System.out.println("Enter the name of the departure airport:");
                    String sourceAirport = scanner.next();
                    System.out.println("Enter the name of the airport of arrival:");
                    String destinationAirport = scanner.next();
                    System.out.println("Enter the departure time (in 'year.month.day hour:minute'):");
                    String departureTimeStr = scanner.next();
                    LocalDateTime departureTime = LocalDateTime.parse(departureTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    System.out.println("Enter time of arrival (in 'year.month.day hour:minute'):");
                    String arrivalTimeStr = scanner.next();
                    LocalDateTime arrivalTime = LocalDateTime.parse(arrivalTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    Flight flight = new Flight(flights.size() + 1, sourceAirport, destinationAirport, departureTime, arrivalTime);
                    flights.add(flight);
                    System.out.println("The flight has been created!");
                    break;
                case 3:
                    System.out.println("Enter the name of the passenger:");
                    String name = scanner.next();
                    System.out.println("Enter passport number:");
                    String passportNumber = scanner.next();
                    Passenger passenger = new Passenger(passengers.size() + 1, name, passportNumber);
                    passengers.add(passenger);
                    System.out.println("Passenger created!");
                    break;
                case 4:
                    System.out.println("Enter the name of the airport:");
                    String airportName = scanner.next();
                    System.out.println("Enter the location of the airport:");
                    String location = scanner.next();
                    Airport airport = new Airport(airports.size() + 1, airportName, location);
                    airports.add(airport);
                    System.out.println("The airport has been created!");
                    break;
                case 5:
                    System.out.println("Flight schedule:");
                    for (Flight flightNav : flights) {
                        System.out.println("Flight " + flightNav.getFlightId());
                        System.out.println("From: " + flightNav.getSourceAirport());
                        System.out.println("To: " + flightNav.getDestinationAirport());
                        System.out.println("Time of departure: " + flightNav.getDepartureTime());
                        System.out.println("----------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Enter the passenger number:");
                    int passengerNumber = scanner.nextInt();
                    System.out.println("Select a flight:");
                    for (int i = 0; i < flights.size(); i++) {
                        System.out.println(i + 1 + ". Flight " + flights.get(i).getFlightId());
                    }
                    int flightChoice = scanner.nextInt();

                    Ticket ticket = Ticket.createTicket(tickets, passengers, flights);
                    if (ticket != null) {
                        System.out.println("The ticket is sold!");
                    } else {
                        System.out.println("Unfortunately, all seats on this flight are taken.");
                    }
                    break;

                case 7:
                    System.out.println("Enter the ticket number to cancel:");
                    int ticketNumber = scanner.nextInt();

                    if (Ticket.cancelTicket(tickets)) {
                        System.out.println("The ticket has been cancelled.");
                    } else {
                        System.out.println("This ticket has already been canceled or was not found.");
                    }
                    break;
                case 8:
                    System.out.println("Enter the starting time for the income calculation (in the format 'year.month.day hour:minute'):");
                    String startTimeStr = scanner.next();
                    LocalDateTime startTime = LocalDateTime.parse(startTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    System.out.println("Enter the final time for the calculation of income (in the format 'year.month.day hour:minute'):");
                    String endTimeStr = scanner.next();
                    LocalDateTime endTime = LocalDateTime.parse(endTimeStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    IncomeCalculator incomeCalculator = new IncomeCalculator();
                    double income = incomeCalculator.calculateIncome(tickets);
                    System.out.println("Total revenue for a given time period: " + income);
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }
}