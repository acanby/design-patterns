package com.canby.factory;

import com.canby.factory.model.Car;
import com.canby.factory.model.impl.FamilySedan;
import com.canby.factory.model.impl.SemiTrailer;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class CarFactoryTest {
    @Test
    public void testCreatesCar() {
        Car car = CarFactory.createCar();

        Assert.assertThat(car, instanceOf(FamilySedan.class));
        Assert.assertThat(car.getTopSpeed(), is(110));
    }

    @Test
    public void testCreatesTruck() {
        Car car = CarFactory.createTruck();

        Assert.assertThat(car, instanceOf(SemiTrailer.class));
        Assert.assertThat(car.getTopSpeed(), is(80));
    }
}