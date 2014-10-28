package com.canby.factory.abstractFactory;

import com.canby.factory.abstractFactory.model.Car;

/**
 * Created by acanby on 23/10/2014.
 */
public interface AbstractCarFactory {
    Car createSmallCar();
    Car createMediumCar();
    Car createLargeCar();
}
