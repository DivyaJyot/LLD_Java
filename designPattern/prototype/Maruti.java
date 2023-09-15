package com.divya.design.pattern.prototype;

public class Maruti implements iCar{
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    public Maruti(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Maruti{" +
                "modelName='" + modelName + '\'' +
                ", engineSize=" + engineSize +
                ", noOfWheels=" + noOfWheels +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public Maruti(Maruti m) {
        this(m.modelName, m.engineSize, m.noOfWheels, m.serialNumber);
    }

    @Override
    public iCar clone() {
        return null;
    }
}
