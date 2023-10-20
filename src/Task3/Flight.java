package Task3;

import java.time.LocalDateTime;

public class Flight {
    private int id;
    private String sourceAirport;
    private String destinationAirport;
    private String departureDateTime;
    private int airplaneId;
    private int availableSeats;

    public Flight(int id, String sourceAirport, String destinationAirport, String departureDateTime, int airplaneId) {
        this.id = id;
        this.sourceAirport = sourceAirport;
        this.destinationAirport = destinationAirport;
        this.departureDateTime = departureDateTime;
        this.airplaneId = airplaneId;
    }

    public Flight(int id, String sourceAirport, String destinationAirport, LocalDateTime departureTime, LocalDateTime arrivalTime) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }
    public int getFlightId() {
        return id;
    }

    public String getDepartureTime() {
        return departureDateTime;
    }
    public void cancelBooking() {
        if (availableSeats < 10) {
            availableSeats++;
        }
    }
}