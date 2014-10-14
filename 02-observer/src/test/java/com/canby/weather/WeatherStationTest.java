package com.canby.weather;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class WeatherStationTest {
    @Test
    public void testAddObserver() {
        WeatherStation weatherStation = mock(WeatherStation.class);
        WeatherWidget weatherWidget = new WeatherWidget();
        weatherWidget.addObservable(weatherStation);

        verify(weatherStation, times(1)).addObserver(weatherWidget);
    }

    @Test
    public void testRemoveObserver() {
        WeatherStation weatherStation = mock(WeatherStation.class);
        WeatherWidget weatherWidget = new WeatherWidget();

        weatherWidget.addObservable(weatherStation);
        weatherWidget.removeObserable();

        verify(weatherStation, times(1)).removeObserver(weatherWidget);
    }

    @Test
    public void testNotify() {
        WeatherStation weatherStation = new WeatherStation();
        WeatherWidget widget1 = spy(new WeatherWidget());
        widget1.addObservable(weatherStation);

        WeatherWidget widget2 = spy(new WeatherWidget());
        widget2.addObservable(weatherStation);

        WeatherWidget widget3 = spy(new WeatherWidget());
        widget3.addObservable(weatherStation);

        weatherStation.updateMeasurements(1, 2, 3);

        verify(widget1).setUpdated();
        verify(widget2).setUpdated();
        verify(widget3).setUpdated();
    }
}