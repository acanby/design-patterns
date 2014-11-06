package com.canby.command.commands.channel;

import com.canby.command.Command;
import com.canby.command.interfaces.HasChannels;

/**
 * Created by acanby on 6/11/2014.
 */
public abstract class AbstractChannelCommand implements Command {

    protected final HasChannels hasChannels;

    protected AbstractChannelCommand(HasChannels hasChannels) {
        this.hasChannels = hasChannels;
    }

    protected void channelUp() {
        hasChannels.channelUp();
    }

    protected void channelDown() {
        hasChannels.channelDown();
    }
}
