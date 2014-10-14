package com.canby.weather;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherWidgetTest {

    @Test
    public void testNotifiedValuesCorrect() {
        float temperature = 17.4f;
        float humidity = 22.0f;
        float pressure = 1003f;

        WeatherStation weatherStation = mock(WeatherStation.class);

        when(weatherStation.getTemperature()).thenReturn(temperature);
        when(weatherStation.getHumidity()).thenReturn(humidity);
        when(weatherStation.getPressure()).thenReturn(pressure);

        WeatherWidget widget = new WeatherWidget();
        widget.addObservable(weatherStation);
        widget.setUpdated();    // just to simulate that it needs to read

        Assert.assertEquals(temperature, widget.getTemperature(), 0);
        Assert.assertEquals(humidity, widget.getHumidity(), 0);
        Assert.assertEquals(pressure, widget.getPressure(), 0);
    }
}