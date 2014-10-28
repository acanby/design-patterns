package com.canby.factory.abstractFactory;

import com.canby.factory.abstractFactory.AbstractCarFactory;
import com.canby.factory.abstractFactory.FordFactory;
import com.canby.factory.abstractFactory.model.Car;
import com.canby.factory.abstractFactory.model.ford.Falcon;
import com.canby.factory.abstractFactory.model.ford.Fiesta;
import com.canby.factory.abstractFactory.model.ford.Focus;
import org.junit.Assert;
import org.junit.Test;

public class FordFactoryTest {
    AbstractCarFactory fordFactory = new FordFactory();

    @Test
    public void testSmallCarIsFiesta() {
        Car car = fordFactory.createSmallCar();

        Assert.assertEquals(Fiesta.class, car.getClass());
        Assert.assertEquals(Car.Classification.SMALL, car.getClassification());
        Assert.assertEquals("Fiesta", car.getName());
    }

    @Test
    public void testMediumCarIsFocus() {
        Car car = fordFactory.createMediumCar();

        Assert.assertEquals(Focus.class, car.getClass());
        Assert.assertEquals(Car.Classification.MEDIUM, car.getClassification());
        Assert.assertEquals("Focus", car.getName());
    }

    @Test
    public void testLargeCarIsFalcon() {
        Car car = fordFactory.createLargeCar();

        Assert.assertEquals(Falcon.class, car.getClass());
        Assert.assertEquals(Car.Classification.LARGE, car.getClassification());
        Assert.assertEquals("Falcon", car.getName());
    }
}