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


    public int getPerHourCost(VehicleType type) {
        int cost = 0;
        switch (type) {
            case CAR:
                cost = 100;
                break;
            case BUS:
                cost = 100;
                break;
            case BIKE:
                cost = 40;
                break;
            default:
                cost=120;
        }
        return  cost;
    }
}
