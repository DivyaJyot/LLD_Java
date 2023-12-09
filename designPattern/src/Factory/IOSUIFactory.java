package com.divya.design.pattern.Factory;

import com.divya.design.pattern.Factory.Component.Button;
import com.divya.design.pattern.Factory.Component.dropDown;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new Button();    }

    @Override
    public dropDown createDropDown() {
        return new dropDown();

    }

    @Override
    public void createLink() {
        System.out.println("link created");

    }
}
