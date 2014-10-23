package com.canby.factory.model.impl;

import com.canby.factory.model.Engine;

/**
 * Created by acanby on 23/10/2014.
 */
public class TwelveCylinderEngine implements Engine {
    @Override
    public int getTopSpeed() {
        return 80;
    }
}
