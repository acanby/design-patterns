package com.canby.factory.abstractFactory;

import com.canby.factory.abstractFactory.model.Car;
import com.canby.factory.abstractFactory.model.mazda.Mazda2;
import com.canby.factory.abstractFactory.model.mazda.Mazda3;
import com.canby.factory.abstractFactory.model.mazda.Mazda6;

/**
 * Created by acanby on 28/10/2014.
 */
public class MazdaFactory implements AbstractCarFactory {
    @Override
    public Car createSmallCar() {
        return new Mazda2();
    }

    @Override
    public Car createMediumCar() {
        return new Mazda3();
    }

    @Override
    public Car createLargeCar() {
        return new Mazda6();
    }
}
