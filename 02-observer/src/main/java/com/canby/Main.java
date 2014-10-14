package com.canby;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.canby.weather.WeatherModule;
import com.canby.weather.WeatherStation;
import com.canby.weather.WeatherWidget;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by acanby on 12/10/2014.
 */
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new WeatherModule());
        List<WeatherWidget> widgetList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            widgetList.add(injector.getInstance(WeatherWidget.class));
        }

        WeatherStation weatherStation = injector.getInstance(WeatherStation.class);
        Random random = new Random();
        for (int i=0;i<10;i++) {
            weatherStation.updateMeasurements(random.nextFloat() % 40, random.nextFloat() % 100, random.nextFloat() % 1300);
        }

    }
}
