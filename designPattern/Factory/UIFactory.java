package com.divya.design.pattern.Factory;

import com.divya.design.pattern.Factory.Component.Button;
import com.divya.design.pattern.Factory.Component.dropDown;

public interface UIFactory {

    public Button createButton();
    public dropDown createDropDown();

    public void createLink();
}
