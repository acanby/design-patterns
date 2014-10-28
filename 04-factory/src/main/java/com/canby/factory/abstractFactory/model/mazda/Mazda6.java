package com.canby.factory.abstractFactory.model.mazda;

import com.canby.factory.abstractFactory.model.Car;

/**
 * Created by acanby on 28/10/2014.
 */
public class Mazda6 implements Car {
    @Override
    public Classification getClassification() {
        return Classification.LARGE;
    }

    @Override
    public String getName() {
        return "Mazda 6";
    }
}
