package com.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String gateNumber;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;

    public Gate() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getGateNumber() { return gateNumber; }
    public void setGateNumber(String gateNumber) { this.gateNumber = gateNumber; }
    public Airport getAirport() { return airport; }
    public void setAirport(Airport airport) { this.airport = airport; }
}
