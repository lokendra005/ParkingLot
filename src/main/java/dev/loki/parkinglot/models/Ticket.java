package dev.loki.parkinglot.models;

import java.util.Date;

public class Ticket extends id{
    private int number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;
    private Gate gate;

}