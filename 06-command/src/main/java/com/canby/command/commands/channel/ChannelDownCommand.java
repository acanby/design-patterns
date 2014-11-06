package com.canby.command.commands.channel;

import com.canby.command.interfaces.HasChannels;

/**
 * Created by acanby on 6/11/2014.
 */
public class ChannelDownCommand extends AbstractChannelCommand {

    public ChannelDownCommand(HasChannels hasChannels) {
        super(hasChannels);
    }

    @Override
    public void execute() {
        channelDown();
    }
}
