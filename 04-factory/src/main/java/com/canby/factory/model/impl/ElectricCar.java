package com.canby.factory.model.impl;

import com.canby.factory.model.Car;
import com.canby.factory.model.Engine;

/**
 * Created by acanby on 23/10/2014.
 */
public class ElectricCar extends Car {
    public ElectricCar(Engine engine) {
        super(engine);
    }
}
