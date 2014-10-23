package com.canby.decorator.model;

/**
 * Created by acanby on 14/10/2014.
 */
public class Salad extends Food {

    public Salad() {
        this.description = "Salad Bowl";
    }

    @Override
    public Double cost() {
        return 4.29;
    }
}
