package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
    @Test
    void airlineCreation() {
        Airline airline = new Airline();
        airline.setName("Air Canada");
        airline.setCode("AC");
        assertEquals("Air Canada", airline.getName());
        assertEquals("AC", airline.getCode());
    }
}
