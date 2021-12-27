package org.deltan.api.command.argument.provider;

import org.deltan.api.command.CommandContext;
import org.deltan.api.command.suggestion.Suggestible;

public interface ArgumentProvider<T> extends Suggestible {

    T get(CommandContext context, String argument) throws ArgumentProvideException;
}
