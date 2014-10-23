package com.canby.factory;

import com.canby.factory.model.Car;
import com.canby.factory.model.Engine;
import com.canby.factory.model.Truck;
import com.canby.factory.model.impl.FamilySedan;
import com.canby.factory.model.impl.FourCylinderEngine;
import com.canby.factory.model.impl.SemiTrailer;
import com.canby.factory.model.impl.TwelveCylinderEngine;

/**
 * Created by acanby on 23/10/2014.
 */
public class CarFactory {
    public static Car createCar() {
        Engine engine = new FourCylinderEngine();
        return new FamilySedan(engine);
    }

    public static Truck createTruck() {
        Engine engine = new TwelveCylinderEngine();
        return new SemiTrailer(engine);
    }
}
