package com.canby.decorator.model;

/**
 * Created by acanby on 14/10/2014.
 */
public abstract class Food {
    protected String description = "Some food";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
