package com.parkinglot.service.strategy;

import com.parkinglot.Ticket;
import com.parkinglot.constants.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowBillCalculationStrategy implements  BillCalculationStrategy{
    private static final int PERHOUR_CHARGE_2_WHEELER=40;
    private static final int PERHOUR_CHARGE_4_WHEELER=100;
    private static final double INCREMENT_FACTOR= 0.1;
    @Override
    public double calculateBillAmount(Ticket ticket, LocalDateTime exitTime) {
        LocalDateTime entrytime= ticket.getEntryTime();
        long totalHours= ChronoUnit.HOURS.between(exitTime,entrytime);
        double basecost= totalHours* getPerHourCost(ticket.getVehicle().getType());
        return basecost+ basecost*INCREMENT_FACTOR*(totalHours-1);
    }


    public int getPerHourCost(VehicleType type){

        switch(type){
            case CAR:
                return 100;
                break;
            case BUS:
                return 100;
                break;
            case BIKE:
                return 40;
                break;

        }

    }
}
