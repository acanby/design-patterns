package com.canby.factory.method;

/**
 * Created by acanby on 28/10/2014.
 */
public class UpgradedCar extends AbstractCar {
    @Override
    public void defineOptions() {
        options.add(CarOptions.AIRCON);
        options.add(CarOptions.MAG_WHEELS);
        options.add(CarOptions.SOUND_SYSTEM_MID);
        options.add(CarOptions.LEATHER_SEATS);
    }
}
