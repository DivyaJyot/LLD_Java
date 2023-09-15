package com.divya.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //starting a new batch-100 sudent

        List<iCar> list= new ArrayList<>();
        list.add(new Tata("SUV",800,4,"1234"));
        list.add(new Tata("SUV2",100,4,"1234909"));
        //String modelName, int engineSize, int noOfWheels, String serialNumber
        list.add(new Maruti("creata",400,4,"4567"));

        list.forEach(v->
        {
            if(v instanceof Tata){
                Tata t= (Tata)v;
               // System.out.println(t.toString());
            }
            if(v instanceof Maruti){
                Maruti t= (Maruti)v;
              //  System.out.println(t);
            }

        });

        for(iCar car:list){
        if(car instanceof Tata){
            Tata t= (Tata)car;
            System.out.println(t.toString());
        }
        if(car instanceof Maruti){
            Maruti t= (Maruti)car;
            System.out.println(t);
        }
        }

    }
}
