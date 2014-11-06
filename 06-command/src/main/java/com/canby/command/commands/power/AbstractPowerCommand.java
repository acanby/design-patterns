package com.canby.command.commands.power;

import com.canby.command.Command;
import com.canby.command.interfaces.HasPower;

/**
 * Created by acanby on 6/11/2014.
 */
public abstract class AbstractPowerCommand implements Command {
    protected final HasPower hasPower;

    public AbstractPowerCommand(HasPower hasPower) {
        this.hasPower = hasPower;
    }

    protected void turnOff() {
        hasPower.turnOff();
    }

    protected void turnOn() {
        hasPower.turnOn();
    }
}
