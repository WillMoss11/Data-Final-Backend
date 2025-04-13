package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/airlines")
public class AirlineController {
    @Autowired
    private AirlineRepository airlineRepository;

    @GetMapping
    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    @GetMapping("/{id}")
    public Airline getAirlineById(@PathVariable Long id) {
        return airlineRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Airline not found"));
    }

    @PostMapping
    public Airline createAirline(@RequestBody Airline airline) {
        return airlineRepository.save(airline);
    }

    @PutMapping("/{id}")
    public Airline updateAirline(@PathVariable Long id, @RequestBody Airline airline) {
        Airline existingAirline = airlineRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Airline not found"));
        existingAirline.setName(airline.getName());
        existingAirline.setCode(airline.getCode());
        return airlineRepository.save(existingAirline);
    }

    @DeleteMapping("/{id}")
    public void deleteAirline(@PathVariable Long id) {
        airlineRepository.deleteById(id);
    }
}
