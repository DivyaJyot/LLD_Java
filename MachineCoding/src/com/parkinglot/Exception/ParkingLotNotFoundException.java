package com.parkinglot.Exception;

public class ParkingLotNotFoundException extends RuntimeException{
    public ParkingLotNotFoundException(String message){
        super(message);
    }
}
