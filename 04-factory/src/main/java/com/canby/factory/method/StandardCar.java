package com.canby.factory.method;

/**
 * Created by acanby on 28/10/2014.
 */
public class StandardCar extends AbstractCar {
    @Override
    public void defineOptions() {
        options.add(CarOptions.AIRCON);
        options.add(CarOptions.SOUND_SYSTEM_BASIC);
    }
}
