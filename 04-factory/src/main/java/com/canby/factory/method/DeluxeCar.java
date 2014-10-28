package com.canby.factory.method;

/**
 * Created by acanby on 28/10/2014.
 */
public class DeluxeCar extends AbstractCar {
    @Override
    public void defineOptions() {
        options.add(CarOptions.AIRCON);
        options.add(CarOptions.MAG_WHEELS);
        options.add(CarOptions.SOUND_SYSTEM_PLUS);
        options.add(CarOptions.LEATHER_SEATS);
        options.add(CarOptions.XENON_LIGHTS);
        options.add(CarOptions.GPS);
        options.add(CarOptions.SUNROOF);
    }
}
