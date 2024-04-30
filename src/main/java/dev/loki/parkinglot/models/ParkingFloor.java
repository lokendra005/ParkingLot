package dev.loki.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ParkingFloor extends id {
    private int number;
    private List<ParkingSpot> parkingSpots;

}
