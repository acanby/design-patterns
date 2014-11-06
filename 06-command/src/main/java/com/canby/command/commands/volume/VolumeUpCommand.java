package com.canby.command.commands.volume;

import com.canby.command.interfaces.HasVolume;

/**
 * Created by acanby on 6/11/2014.
 */
public class VolumeUpCommand extends AbstractVolumeCommand {

    public VolumeUpCommand(HasVolume hasVolume) {
        super(hasVolume);
    }

    @Override
    public void execute() {
        volumeUp();
    }
}
