package com.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Arrival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String flightNumber;

    @NotNull
    private LocalDateTime scheduledArrivalTime;

    private LocalDateTime actualArrivalTime;
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

    public Arrival() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public LocalDateTime getScheduledArrivalTime() { return scheduledArrivalTime; }
    public void setScheduledArrivalTime(LocalDateTime scheduledArrivalTime) { this.scheduledArrivalTime = scheduledArrivalTime; }
    public LocalDateTime getActualArrivalTime() { return actualArrivalTime; }
    public void setActualArrivalTime(LocalDateTime actualArrivalTime) { this.actualArrivalTime = actualArrivalTime; }
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
