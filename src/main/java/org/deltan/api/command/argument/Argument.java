package org.deltan.api.command.argument;

import org.deltan.api.command.argument.provider.ArgumentProvider;

public interface Argument<T> {

    String getName();

    boolean isRequired();

    ArgumentProvider<T> getProvider();
}
