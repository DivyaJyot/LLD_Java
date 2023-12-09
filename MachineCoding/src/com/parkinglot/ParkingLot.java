package com.parkinglot;

import com.parkinglot.constants.ParkingLotStatus;
import com.parkinglot.constants.VehicleType;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<VehicleType> sopportedVehicle;
    private Vehicle vehicle;

    private ParkingLotStatus parkingLotStatus;

    public List<VehicleType> getSopportedVehicle() {
        return sopportedVehicle;
    }

    public void setSopportedVehicle(List<VehicleType> sopportedVehicle) {
        this.sopportedVehicle = sopportedVehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
