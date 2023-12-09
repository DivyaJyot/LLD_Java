package com.parkinglot.service.strategy;

import com.parkinglot.Gate;
import com.parkinglot.ParkingLot;
import com.parkinglot.ParkingSlot;
import com.parkinglot.constants.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot findParkingSlot(VehicleType type, Gate gate, ParkingLot parkingLot);
}
