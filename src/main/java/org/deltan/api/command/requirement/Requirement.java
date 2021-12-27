package org.deltan.api.command.requirement;

import org.deltan.api.command.sender.CommandSender;

import java.util.Optional;
import java.util.function.Predicate;

public interface Requirement {

    default Optional<Requirement> getParent() {
        return Optional.empty();
    }

    Predicate<CommandSender> getPredicate();

    String getErrorMessage();
}
