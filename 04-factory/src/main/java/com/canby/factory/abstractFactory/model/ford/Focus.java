package com.canby.factory.abstractFactory.model.ford;

import com.canby.factory.abstractFactory.model.Car;

/**
 * Created by acanby on 28/10/2014.
 */
public class Focus implements Car {
    @Override
    public Classification getClassification() {
        return Classification.MEDIUM;
    }

    @Override
    public String getName() {
        return "Focus";
    }
}
