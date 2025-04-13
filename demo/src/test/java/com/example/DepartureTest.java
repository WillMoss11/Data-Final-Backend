package com.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DepartureTest {
    @Test
    void departureCreation() {
        Departure departure = new Departure();
        departure.setFlightNumber("UA202");
        departure.setScheduledDepartureTime(LocalDateTime.now().plusHours(2));
        assertEquals("UA202", departure.getFlightNumber());
        assertNotNull(departure.getScheduledDepartureTime());
    }
}
