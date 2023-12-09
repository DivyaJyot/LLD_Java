package com.divya.design.pattern.strategy;

public class GoogleMaps {
    public void findPath(String src,String dest, TransportMode mode){
        IPathCalculator pathCalculator= PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.calculatePath(src,dest);


    }
}
