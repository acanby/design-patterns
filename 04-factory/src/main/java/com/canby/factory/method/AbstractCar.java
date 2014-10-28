package com.canby.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acanby on 28/10/2014.
 */
public abstract class AbstractCar {
    final List<CarOptions> options;

    protected AbstractCar() {
        options = new ArrayList<>();
        defineOptions();
    }

    public abstract void defineOptions();

    public List<CarOptions> getOptions() {
        return new ArrayList<>(options);
    }
}
