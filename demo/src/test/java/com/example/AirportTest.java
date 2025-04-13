package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {
    @Test
    void airportCreation() {
        Airport airport = new Airport();
        airport.setName("Toronto Pearson");
        airport.setCode("YYZ");
        assertEquals("Toronto Pearson", airport.getName());
        assertEquals("YYZ", airport.getCode());
    }
}
