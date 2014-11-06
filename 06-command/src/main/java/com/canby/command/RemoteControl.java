package com.canby.command;

/**
 * Created by acanby on 6/11/2014.
 */
public class RemoteControl {
    private final Command powerOnCommand;
    private final Command powerOffCommand;
    private final Command volumeUpCommand;
    private final Command volumeDownCommand;
    private final Command channelUpCommand;
    private final Command channelDownCommand;

    public RemoteControl(Command powerUpCommand, Command powerDownCommand, Command volumeUpCommand,
                         Command volumeDownCommand, Command channelUpCommand, Command channelDownCommand) {
        this.powerOnCommand = powerUpCommand;
        this.powerOffCommand = powerDownCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
        this.channelUpCommand = channelUpCommand;
        this.channelDownCommand = channelDownCommand;
    }

    public void powerOn() {
        powerOnCommand.execute();
    }

    public void powerOff() {
        powerOffCommand.execute();
    }

    public void volumeUp() {
        volumeUpCommand.execute();
    }

    public void volumeDown() {
        volumeDownCommand.execute();
    }

    public void channelUp() {
        channelUpCommand.execute();
    }

    public void channelDown() {
        channelDownCommand.execute();
    }
}
