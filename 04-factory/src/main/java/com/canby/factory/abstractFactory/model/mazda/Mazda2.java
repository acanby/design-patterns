package com.canby.factory.abstractFactory.model.mazda;

import com.canby.factory.abstractFactory.model.Car;

/**
 * Created by acanby on 28/10/2014.
 */
public class Mazda2 implements Car {
    @Override
    public Classification getClassification() {
        return Classification.SMALL;
    }

    @Override
    public String getName() {
        return "Mazda 2";
    }
}
