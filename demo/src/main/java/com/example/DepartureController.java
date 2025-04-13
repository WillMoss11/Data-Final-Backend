package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/departures")
public class DepartureController {
    @Autowired
    private DepartureRepository departureRepository;

    @GetMapping
    public List<Departure> getAllDepartures() {
        return departureRepository.findAll();
    }

    @GetMapping("/{id}")
    public Departure getDepartureById(@PathVariable Long id) {
        return departureRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Departure not found"));
    }

    @PostMapping
    public Departure createDeparture(@RequestBody Departure departure) {
        return departureRepository.save(departure);
    }

    @PutMapping("/{id}")
    public Departure updateDeparture(@PathVariable Long id, @RequestBody Departure departure) {
        Departure existingDeparture = departureRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Departure not found"));
        
        existingDeparture.setFlightNumber(departure.getFlightNumber());
        existingDeparture.setScheduledDepartureTime(departure.getScheduledDepartureTime());
        existingDeparture.setActualDepartureTime(departure.getActualDepartureTime());
        existingDeparture.setStatus(departure.getStatus());
        existingDeparture.setAircraft(departure.getAircraft());
        existingDeparture.setAirline(departure.getAirline());
        existingDeparture.setAirport(departure.getAirport());
        existingDeparture.setGate(departure.getGate());
        return departureRepository.save(existingDeparture);
    }

    @DeleteMapping("/{id}")
    public void deleteDeparture(@PathVariable Long id) {
        departureRepository.deleteById(id);
    }
}
