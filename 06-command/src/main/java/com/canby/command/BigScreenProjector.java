package com.canby.command;

import com.canby.command.interfaces.HasChannels;
import com.canby.command.interfaces.HasPower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by acanby on 6/11/2014.
 */
public class BigScreenProjector implements HasPower, HasChannels {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigScreenProjector.class);

    @Override
    public void channelUp() {
        LOGGER.info("Changing input up for projector");
    }

    @Override
    public void channelDown() {
        LOGGER.info("Changing input down for projector");
    }

    @Override
    public void turnOn() {
        LOGGER.info("Turning projector on");
    }

    @Override
    public void turnOff() {
        LOGGER.info("Turning projector off. Please wait 60 seconds before turning on again");
    }
}
