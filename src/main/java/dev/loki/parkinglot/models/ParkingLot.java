package dev.loki.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingLot extends id {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
}
