package Task3;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Ticket {
    private int ticketId;
    private int flightId;
    private int passengerId;
    private LocalDateTime purchaseTime;
    private boolean isCancelled;

    public Ticket(int ticketId, int flightId, int passengerId, LocalDateTime purchaseTime) {
        this.ticketId = ticketId;
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.purchaseTime = purchaseTime;
        this.isCancelled = false;
    }

    public static Ticket createTicket(List<Ticket> tickets, List<Passenger> passengers, List<Flight> flights) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the passenger number:");
        int passengerNumber = scanner.nextInt();
        System.out.println("Select a flight:");
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(i + 1 + ". Flight " + flights.get(i).getFlightId());
        }
        int flightChoice = scanner.nextInt();
        Flight selectedFlight = flights.get(flightChoice - 1);
        return null;
    }

    public static boolean cancelTicket(List<Ticket> tickets) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ticket number to cancel:");
        int ticketNumber = scanner.nextInt();

        for (Ticket ticket : tickets) {
            if (ticket.getTicketNumber() == ticketNumber) {
                if (!ticket.isCancelled()) {
                    Flight flight = ticket.getFlight(null);
                    flight.cancelBooking();
                    ticket.setCancelled(true);
                    System.out.println("The ticket has been cancelled.");
                } else {
                    System.out.println("This ticket has already been cancelled.");
                }
                return false;
            }
        }
        System.out.println(" " + ticketNumber + " not found.");
        return false;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(LocalDateTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
    public int getTicketNumber() {
        return ticketId;
    }
    public Flight getFlight(List<Flight> flights) {
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                return flight;
            }
        }
        return null;
    }
}
