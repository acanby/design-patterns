package com.canby.factory.abstractFactory.model;

/**
 * Created by acanby on 23/10/2014.
 */
public interface Car {
    public enum Classification {
        SMALL,
        MEDIUM,
        LARGE
    }

    Classification getClassification();
    String getName();
}
