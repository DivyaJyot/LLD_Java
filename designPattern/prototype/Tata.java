package com.divya.design.pattern.prototype;

public class Tata implements iCar{

    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;
    public Tata(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Tata{" +
                "modelName='" + modelName + '\'' +
                ", engineSize=" + engineSize +
                ", noOfWheels=" + noOfWheels +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public Tata(Tata t) {
        this(t.modelName, t.engineSize, t.noOfWheels, t.serialNumber);
    }
    @Override
    public iCar clone() {
        return null;
    }

}
