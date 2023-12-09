package com.divya.design.pattern.Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatform platform){
        return
                switch(platform){
                    case ANDROID-> new AndroidUIFactory();
                    case IOS -> new IOSUIFactory();
                    default -> new AndroidUIFactory();
                };
    }
}
