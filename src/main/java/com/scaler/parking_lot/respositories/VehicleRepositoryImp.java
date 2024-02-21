package com.scaler.parking_lot.respositories;

import com.scaler.parking_lot.models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleRepositoryImp implements VehicleRepository{

    private final List<Vehicle> vehicles = new ArrayList<>();
    @Override
    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber) {
        for(Vehicle vehicle:vehicles){
            if(vehicle.getRegistrationNumber()==registrationNumber){
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }
}
