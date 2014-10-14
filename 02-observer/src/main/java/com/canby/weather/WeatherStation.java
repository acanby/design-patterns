package com.canby.weather;

import com.canby.observer.Observable;
import com.canby.observer.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by acanby on 12/10/2014.
 */
public class WeatherStation implements Observable {
    private Set<Observer> observers = new HashSet<>();
    private boolean changed = false;

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.setUpdated();
        }

        changed = false;
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    public boolean isChanged() {
        return changed;
    }

    /**
     * Update the temperature and notify any observers
     *
     * @param temperature new temperature
     * @param humidity new humidity
     * @param pressure new pressure
     */
    public void updateMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
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
