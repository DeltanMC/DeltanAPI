package org.deltan.api.command.suggestion;

import java.util.Optional;

public interface Suggestion {

    String getSuggestion();

    default Optional<String> getToolTip() {
        return Optional.empty();
    }
}
