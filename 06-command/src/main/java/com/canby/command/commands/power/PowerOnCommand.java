package com.canby.command.commands.power;

import com.canby.command.interfaces.HasPower;

/**
 * Created by acanby on 6/11/2014.
 */
public class PowerOnCommand extends AbstractPowerCommand {

    public PowerOnCommand(HasPower hasPower) {
        super(hasPower);
    }

    @Override
    public void execute() {
        turnOn();
    }
}
