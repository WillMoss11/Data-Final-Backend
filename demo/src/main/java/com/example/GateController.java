package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/gates")
public class GateController {
    @Autowired
    private GateRepository gateRepository;

    @Autowired
    private AirportRepository airportRepository;

    @GetMapping
    public List<Gate> getAllGates() {
        return gateRepository.findAll();
    }

    @GetMapping("/{id}")
    public Gate getGateById(@PathVariable Long id) {
        return gateRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Gate not found"));
    }

    @PostMapping
    public Gate createGate(@RequestBody Gate gate, @RequestParam Long airportId) {
        Airport airport = airportRepository.findById(airportId).orElseThrow(() -> new EntityNotFoundException("Airport not found"));
        gate.setAirport(airport);
        return gateRepository.save(gate);
    }

    @PutMapping("/{id}")
    public Gate updateGate(@PathVariable Long id, @RequestBody Gate gate, @RequestParam Long airportId) {
        Gate existingGate = gateRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Gate not found"));
        Airport airport = airportRepository.findById(airportId).orElseThrow(() -> new EntityNotFoundException("Airport not found"));
        existingGate.setGateNumber(gate.getGateNumber());
        existingGate.setAirport(airport);
        return gateRepository.save(existingGate);
    }

    @DeleteMapping("/{id}")
    public void deleteGate(@PathVariable Long id) {
        gateRepository.deleteById(id);
    }

    @GetMapping("/airport/{airportId}")
    public List<Gate> getGatesByAirportId(@PathVariable Long airportId) {
        return gateRepository.findByAirportId(airportId);
    }
}
