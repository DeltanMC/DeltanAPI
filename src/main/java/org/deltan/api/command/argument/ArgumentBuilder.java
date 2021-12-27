package org.deltan.api.command.argument;

import org.deltan.api.command.argument.provider.ArgumentProvider;

public interface ArgumentBuilder<T> {

    ArgumentBuilder<T> withName();

    ArgumentBuilder<T> isRequired();

    ArgumentBuilder<T> isFacultative();

    ArgumentBuilder<T> withProvider(T provider);

    ArgumentProvider<T> build();
}
