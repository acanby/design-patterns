package com.canby.command;

import com.canby.command.interfaces.HasChannels;
import com.canby.command.interfaces.HasPower;
import com.canby.command.interfaces.HasVolume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by acanby on 6/11/2014.
 */
public class SonyLCD implements HasVolume, HasPower, HasChannels {

    private static final Logger LOGGER = LoggerFactory.getLogger(SonyLCD.class);

    public void channelUp() {
        LOGGER.info("Channel up");
    }

    @Override
    public void channelDown() {
        LOGGER.info("Channel down");
    }

    @Override
    public void turnOn() {
        LOGGER.info("Power on");
    }

    @Override
    public void turnOff() {
        LOGGER.info("Power off");
    }

    @Override
    public void volumeUp() {
        LOGGER.info("Volume up");
    }

    @Override
    public void volumeDown() {
        LOGGER.info("Volume down");
    }
}
