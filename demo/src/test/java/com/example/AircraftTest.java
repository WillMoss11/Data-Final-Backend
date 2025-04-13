package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AircraftTest {
    @Test
    void aircraftCreation() {
        Aircraft aircraft = new Aircraft();
        aircraft.setType("Boeing 737");
        aircraft.setAirlineName("Southwest");
        assertEquals("Boeing 737", aircraft.getType());
        assertEquals("Southwest", aircraft.getAirlineName());
    }
}
