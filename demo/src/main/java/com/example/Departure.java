package com.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Departure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String flightNumber;

    @NotNull
    private LocalDateTime scheduledDepartureTime;

    private LocalDateTime actualDepartureTime;
    private String status;

    @ManyToOne
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;

    @ManyToOne
    @JoinColumn(name = "gate_id")
    private Gate gate;

    public Departure() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public LocalDateTime getScheduledDepartureTime() { return scheduledDepartureTime; }
    public void setScheduledDepartureTime(LocalDateTime scheduledDepartureTime) { this.scheduledDepartureTime = scheduledDepartureTime; }
    public LocalDateTime getActualDepartureTime() { return actualDepartureTime; }
    public void setActualDepartureTime(LocalDateTime actualDepartureTime) { this.actualDepartureTime = actualDepartureTime; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Aircraft getAircraft() { return aircraft; }
    public void setAircraft(Aircraft aircraft) { this.aircraft = aircraft; }
    public Airline getAirline() { return airline; }
    public void setAirline(Airline airline) { this.airline = airline; }
    public Airport getAirport() { return airport; }
    public void setAirport(Airport airport) { this.airport = airport; }
    public Gate getGate() { return gate; }
    public void setGate(Gate gate) { this.gate = gate; }
}
