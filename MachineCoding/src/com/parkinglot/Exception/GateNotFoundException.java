package com.parkinglot.Exception;

public class GateNotFoundException extends RuntimeException {
    public GateNotFoundException(String message){
        super(message);
    }
}
