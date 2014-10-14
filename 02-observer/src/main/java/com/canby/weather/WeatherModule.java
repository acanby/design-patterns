package com.canby.weather;/*
 * Created by IntelliJ IDEA.
 * User: acanby
 * Date: 12/10/2014
 * Time: 9:28 PM
 */

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class WeatherModule extends AbstractModule {
    protected void configure() {

    }

    @Provides
    @Singleton
    public WeatherStation getWeatherStation() {
        return new WeatherStation();
    }
}
