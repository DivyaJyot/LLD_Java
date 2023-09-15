package com.divya.design.pattern.prototype;

import java.util.HashMap;

public class Registry {

    private HashMap<String,Student>  studentRegistry;

    public Registry(){
        this.studentRegistry= new HashMap<>();
    }

    public void addToRegistry(Student s){


    }

    public Student getFromRegistry(String key ){
        return studentRegistry.get(key);
    }
}
