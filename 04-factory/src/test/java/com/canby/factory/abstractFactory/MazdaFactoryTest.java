package com.canby.factory.abstractFactory;

import com.canby.factory.abstractFactory.model.Car;
import com.canby.factory.abstractFactory.model.mazda.Mazda2;
import com.canby.factory.abstractFactory.model.mazda.Mazda3;
import com.canby.factory.abstractFactory.model.mazda.Mazda6;
import org.junit.Assert;
import org.junit.Test;

public class MazdaFactoryTest {
    AbstractCarFactory mazdaFactory = new MazdaFactory();

    @Test
    public void testSmallCarIsMazda2() {
        Car car = mazdaFactory.createSmallCar();

        Assert.assertEquals(Mazda2.class, car.getClass());
        Assert.assertEquals(Car.Classification.SMALL, car.getClassification());
        Assert.assertEquals("Mazda 2", car.getName());
    }

    @Test
    public void testMediumCarIsMazda3() {
        Car car = mazdaFactory.createMediumCar();

        Assert.assertEquals(Mazda3.class, car.getClass());
        Assert.assertEquals(Car.Classification.MEDIUM, car.getClassification());
        Assert.assertEquals("Mazda 3", car.getName());
    }

    @Test
    public void testSmallCarIsMazda6() {
        Car car = mazdaFactory.createLargeCar();

        Assert.assertEquals(Mazda6.class, car.getClass());
        Assert.assertEquals(Car.Classification.LARGE, car.getClassification());
        Assert.assertEquals("Mazda 6", car.getName());
    }
}