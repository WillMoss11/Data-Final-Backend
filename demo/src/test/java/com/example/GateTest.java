package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GateTest {
    @Test
    void gateCreation() {
        Gate gate = new Gate();
        gate.setGateNumber("A1");
        assertEquals("A1", gate.getGateNumber());
    }
}
