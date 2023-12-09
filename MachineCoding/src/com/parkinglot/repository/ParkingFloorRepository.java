package com.parkinglot.repository;

import com.parkinglot.Exception.ParkingFloorNotFoundException;
import com.parkinglot.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    Map<Integer, ParkingFloor> parkingFloorMap;
    public ParkingFloorRepository(){
        this.parkingFloorMap=new HashMap<>();

    }

    public ParkingFloor getParkingFloor(int id){
        ParkingFloor parkingFloor= parkingFloorMap.get(id);
        if(parkingFloor==null){
            throw new ParkingFloorNotFoundException("Parking floor not found with id "+id);
        }
        return parkingFloor;
    }


}
