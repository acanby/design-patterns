package com.canby.command;

import com.canby.command.commands.NoopCommand;
import com.canby.command.commands.channel.AbstractChannelCommand;
import com.canby.command.commands.channel.ChannelDownCommand;
import com.canby.command.commands.channel.ChannelUpCommand;
import com.canby.command.commands.power.AbstractPowerCommand;
import com.canby.command.commands.power.PowerOffCommand;
import com.canby.command.commands.power.PowerOnCommand;
import com.canby.command.commands.volume.AbstractVolumeCommand;
import com.canby.command.commands.volume.VolumeDownCommand;
import com.canby.command.commands.volume.VolumeUpCommand;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class CommandTest {

    @Test
    public void testTvRemote() {
        SonyLCD tv = mock(SonyLCD.class);

        AbstractPowerCommand powerOn = new PowerOnCommand(tv);
        AbstractPowerCommand powerOff = new PowerOffCommand(tv);
        AbstractVolumeCommand volumeUp = new VolumeUpCommand(tv);
        AbstractVolumeCommand volumeDown = new VolumeDownCommand(tv);
        AbstractChannelCommand channelUp = new ChannelUpCommand(tv);
        AbstractChannelCommand channelDown = new ChannelDownCommand(tv);

        RemoteControl sonyRemote = new RemoteControl(powerOn, powerOff, volumeUp, volumeDown, channelUp, channelDown);

        sonyRemote.powerOn();
        sonyRemote.powerOff();
        sonyRemote.volumeDown();
        sonyRemote.volumeUp();
        sonyRemote.volumeUp();  // yes, twice
        sonyRemote.channelUp();
        sonyRemote.channelDown();
        sonyRemote.channelUp(); // yes, again

        Mockito.verify(tv, times(1)).turnOn();
        Mockito.verify(tv, times(1)).turnOff();
        Mockito.verify(tv, times(1)).volumeDown();
        Mockito.verify(tv, times(2)).volumeUp();
        Mockito.verify(tv, times(2)).channelUp();
        Mockito.verify(tv, times(1)).channelDown();
    }

    @Test
    public void testProjector() {
        BigScreenProjector projector = mock(BigScreenProjector.class);

        AbstractPowerCommand powerOn = new PowerOnCommand(projector);
        AbstractPowerCommand powerOff = new PowerOffCommand(projector);
        AbstractChannelCommand channelUp = new ChannelUpCommand(projector);
        AbstractChannelCommand channelDown = new ChannelDownCommand(projector);

        RemoteControl projectorRemote = new RemoteControl(powerOn, powerOff, new NoopCommand(), new NoopCommand(), channelUp, channelDown);

        projectorRemote.powerOn();
        projectorRemote.powerOff();
        projectorRemote.channelDown();
        projectorRemote.channelDown();
        projectorRemote.channelUp();
        projectorRemote.channelUp();
        projectorRemote.channelUp();

        Mockito.verify(projector, times(1)).turnOn();
        Mockito.verify(projector, times(1)).turnOff();
        Mockito.verify(projector, times(3)).channelUp();
        Mockito.verify(projector, times(2)).channelDown();

        // Test the no op command. Nothing should change count wise
        projectorRemote.volumeUp();
        projectorRemote.volumeUp();
        projectorRemote.volumeUp();
        projectorRemote.volumeDown();
        projectorRemote.volumeDown();
        projectorRemote.volumeDown();
        projectorRemote.volumeDown();
        projectorRemote.volumeDown();

        Mockito.verify(projector, times(1)).turnOn();
        Mockito.verify(projector, times(1)).turnOff();
        Mockito.verify(projector, times(3)).channelUp();
        Mockito.verify(projector, times(2)).channelDown();
    }
}