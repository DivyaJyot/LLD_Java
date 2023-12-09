package com.divya.design.pattern.strategy;

public class PathCalculatorFactory {
public static IPathCalculator getPathCalculator(TransportMode mode){
    return switch(mode){
        case CAR ->new CarPathCalculator();
        case BIKE ->new BikePathCalculator();
        case WALK ->new WalkPathCalculator();
    };


}

}
