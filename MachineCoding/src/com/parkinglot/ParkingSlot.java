package com.parkinglot;

import com.parkinglot.constants.ParkingLotStatus;
import com.parkinglot.constants.VehicleType;

import java.util.List;

public class ParkingSlot {
    private int sloNumber;
    private List<VehicleType> supportedType;
    private ParkingLotStatus status;

    private Vehicle vehicle;

    public int getSloNumber() {
        return sloNumber;
    }

    public void setSloNumber(int sloNumber) {
        this.sloNumber = sloNumber;
    }

    public List<VehicleType> getSupportedType() {
        return supportedType;
    }

    public void setSupportedType(List<VehicleType> supportedType) {
        this.supportedType = supportedType;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
