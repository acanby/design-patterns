package com.canby.decorator.model;

/**
 * Created by acanby on 14/10/2014.
 */
public class Sandwich extends Food {

    public Sandwich() {
        this.description = "Sandwich";
    }

    @Override
    public Double cost() {
        return 4.99;
    }
}
