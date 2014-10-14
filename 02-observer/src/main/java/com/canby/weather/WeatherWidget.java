package com.canby.weather;

import com.canby.observer.Observer;
import com.google.inject.Inject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by acanby on 12/10/2014.
 */
public class WeatherWidget implements Observer {
    private static final Logger LOGGER = Logger.getLogger(WeatherWidget.class.getName());
    private WeatherStation weatherStation;

    private float temperature;
    private float humidity;
    private float pressure;

    @Inject
    public WeatherWidget() {

    }

    public void addObservable(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public WeatherStation removeObserable() {
        WeatherStation toReturn = this.weatherStation;
        this.weatherStation.removeObserver(this);

        this.weatherStation = null;
        return toReturn;
    }

    @Override
    public void setUpdated() {
        LOGGER.log(Level.INFO, "Update! Going to change the measurements on the widget.");
        LOGGER.log(Level.FINE, "{} {} {}", new Object[] {temperature, humidity, pressure});

        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.pressure = weatherStation.getPressure();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
