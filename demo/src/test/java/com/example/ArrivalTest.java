package com.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class ArrivalTest {
    @Test
    void arrivalCreation() {
        Arrival arrival = new Arrival();
        arrival.setFlightNumber("AC101");
        arrival.setScheduledArrivalTime(LocalDateTime.now());
        assertEquals("AC101", arrival.getFlightNumber());
        assertNotNull(arrival.getScheduledArrivalTime());
    }
}
