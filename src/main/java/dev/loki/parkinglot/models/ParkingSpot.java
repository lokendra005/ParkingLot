package dev.loki.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParkingSpot extends id {
    private int number;
    private List<VehicleType> vehicleTypeList;
    private ParkingSpotStatus parkingSpotStatus;

}
