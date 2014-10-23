package com.canby.factory.model;

/**
 * Created by acanby on 23/10/2014.
 */
public abstract class Car {
    Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    public int getTopSpeed() {
        return engine.getTopSpeed();
    }
}
