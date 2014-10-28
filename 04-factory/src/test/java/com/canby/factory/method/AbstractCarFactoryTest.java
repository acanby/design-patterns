package com.canby.factory.method;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AbstractCarFactoryTest {

    @Test
    public void testStandardCar() {
        AbstractCar car = new StandardCar();
        List<CarOptions> options = car.getOptions();

        Assert.assertNotNull(options);
        Assert.assertEquals(2, options.size());

        Assert.assertThat(options, CoreMatchers.hasItems(CarOptions.AIRCON, CarOptions.SOUND_SYSTEM_BASIC));
    }

    @Test
    public void testUpgradedCar() {
        AbstractCar car = new UpgradedCar();
        List<CarOptions> options = car.getOptions();

        Assert.assertNotNull(options);
        Assert.assertEquals(4, options.size());

        Assert.assertThat(options,
                CoreMatchers.hasItems(
                        CarOptions.AIRCON,
                        CarOptions.SOUND_SYSTEM_MID,
                        CarOptions.MAG_WHEELS,
                        CarOptions.LEATHER_SEATS
                )
        );
    }

    @Test
    public void testDeluxeCar() {
        AbstractCar car = new DeluxeCar();
        List<CarOptions> options = car.getOptions();

        Assert.assertNotNull(options);
        Assert.assertEquals(7, options.size());

        Assert.assertThat(options,
                CoreMatchers.hasItems(
                        CarOptions.AIRCON,
                        CarOptions.SOUND_SYSTEM_PLUS,
                        CarOptions.MAG_WHEELS,
                        CarOptions.LEATHER_SEATS,
                        CarOptions.GPS,
                        CarOptions.XENON_LIGHTS,
                        CarOptions.SUNROOF
                )
        );
    }
}