package com.divya.design.pattern.Factory;

import com.divya.design.pattern.Factory.Component.Button;
import com.divya.design.pattern.Factory.Component.dropDown;

public class Main {

    public static void main(String[] args) {
        UIFactory uifactory= UIFactoryFactory.getUIFactory(SupportedPlatform.IOS);
        Button button = uifactory.createButton();
        dropDown dp= uifactory.createDropDown();
    }

}
