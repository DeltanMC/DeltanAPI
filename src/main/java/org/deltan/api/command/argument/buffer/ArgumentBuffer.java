package org.deltan.api.command.argument.buffer;

import java.util.Optional;

public interface ArgumentBuffer {

    <T> T readArgument();

    <T> Optional<T> readOptionalArgument();
}
