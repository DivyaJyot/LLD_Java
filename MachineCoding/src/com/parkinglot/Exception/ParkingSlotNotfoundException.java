package com.parkinglot.Exception;

public class ParkingSlotNotfoundException extends RuntimeException{
    public  ParkingSlotNotfoundException(String message){
        super(message);
    }
}
