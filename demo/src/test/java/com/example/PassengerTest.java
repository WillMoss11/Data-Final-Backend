package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test
    void passengerCreation() {
        Passenger passenger = new Passenger();
        passenger.setFirstName("John");
        passenger.setLastName("Doe");
        assertEquals("John", passenger.getFirstName());
        assertEquals("Doe", passenger.getLastName());
    }
}
