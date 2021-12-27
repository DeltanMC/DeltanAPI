package org.deltan.api.command;

import org.deltan.api.command.argument.buffer.ArgumentBuffer;
import org.deltan.api.command.sender.CommandSender;

public interface CommandContext {

    CommandSender getSender();

    ArgumentBuffer getBuffer();
}
