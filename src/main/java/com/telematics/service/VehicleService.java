package com.telematics.service;

import com.telematics.model.Vehicle;
import com.telematics.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return repository.findAll();
    }

    public Vehicle getVehicleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteVehicle(Long id) {
        repository.deleteById(id);
    }
}
