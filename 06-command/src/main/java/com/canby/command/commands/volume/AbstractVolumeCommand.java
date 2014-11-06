package com.canby.command.commands.volume;

import com.canby.command.Command;
import com.canby.command.interfaces.HasVolume;

/**
 * Created by acanby on 6/11/2014.
 */
public abstract class AbstractVolumeCommand implements Command {

    protected final HasVolume hasVolume;

    protected AbstractVolumeCommand(HasVolume hasVolume) {
        this.hasVolume = hasVolume;
    }

    protected void volumeUp() {
        hasVolume.volumeUp();
    }

    protected void volumeDown() {
        hasVolume.volumeDown();
    }
}
