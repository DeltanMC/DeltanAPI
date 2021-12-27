package org.deltan.api.command.execution;

import org.deltan.api.command.CommandContext;

public interface CommandExecutor {

    CommandResult execute(CommandContext context);
}
