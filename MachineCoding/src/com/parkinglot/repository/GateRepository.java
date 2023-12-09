package com.parkinglot.repository;

import com.parkinglot.Exception.GateNotFoundException;
import com.parkinglot.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<String,Gate> gateMap= new HashMap<>();

    public Gate getDateById(String id){
        if(gateMap.get(id)==null){
            throw new GateNotFoundException("Gate not found with id-"+id);
        }
        return gateMap.get(id);
    }

    public Gate put(Gate gate){
        gateMap.put(gate.getId(),gate);
        return gate;
    }
}
