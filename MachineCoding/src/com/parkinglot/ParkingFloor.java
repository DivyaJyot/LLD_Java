package com.parkinglot;
import com.parkinglot.constants.ParkingFloorStatus;

import java.util.List;
public class ParkingFloor {
    private List<ParkingSlot> slots;
    private int floorNumber;
    private List<Gate> gates;
    private ParkingFloorStatus status;

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
