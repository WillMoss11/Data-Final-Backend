package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {
    @Test
    void cityCreation() {
        City city = new City();
        city.setName("Toronto");
        city.setPopulation(2930000);
        assertEquals("Toronto", city.getName());
        assertEquals(2930000, city.getPopulation());
    }
}
