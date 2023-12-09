package com.divya.design.pattern.strategy;

public class BikePathCalculator implements IPathCalculator{
    @Override
    public void calculatePath(String src, String dest) {
        System.out.println("path calculated for bike");
    }
}
