package com.canby.factory.abstractFactory;

import com.canby.factory.abstractFactory.model.Car;
import com.canby.factory.abstractFactory.model.ford.Falcon;
import com.canby.factory.abstractFactory.model.ford.Fiesta;
import com.canby.factory.abstractFactory.model.ford.Focus;

/**
 * Created by acanby on 28/10/2014.
 */
public class FordFactory implements AbstractCarFactory {
    @Override
    public Car createSmallCar() {
        return new Fiesta();
    }

    @Override
    public Car createMediumCar() {
        return new Focus();
    }

    @Override
    public Car createLargeCar() {
        return new Falcon();
    }
}
