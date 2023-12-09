package com.parkinglot.Exception;

public class ParkingFloorNotFoundException extends RuntimeException{
    public ParkingFloorNotFoundException(String message){
        super(message);
    }
}
