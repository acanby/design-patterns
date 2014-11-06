package com.canby.command.commands.channel;

import com.canby.command.interfaces.HasChannels;

/**
 * Created by acanby on 6/11/2014.
 */
public class ChannelUpCommand extends AbstractChannelCommand {

    public ChannelUpCommand(HasChannels hasChannels) {
        super(hasChannels);
    }

    @Override
    public void execute() {
        channelUp();
    }
}
