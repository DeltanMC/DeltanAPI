package org.deltan.api.command;

import org.deltan.api.command.argument.Argument;
import org.deltan.api.command.requirement.Requirement;

public interface CommandBuilder {

    CommandBuilder withName(String name);

    CommandBuilder withDescription(String description);

    CommandBuilder withAliases(String... aliases);

    CommandBuilder withPermissions(String... permissions);

    <T> CommandBuilder withArgument(Argument<T> argument);

    CommandBuilder withRequirements(Requirement... requirements);

    Command build();
}
