package com.canby.command.commands;

import com.canby.command.Command;

/**
 * A deliberate no operation command, to avoid {@link java.lang.NullPointerException
 * }
 * @author acanby
 */
public final class NoopCommand implements Command {
    @Override
    public void execute() {
        // do nothing, intentionally
    }
}
