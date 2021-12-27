package org.deltan.api.command.suggestion;

import java.util.Collection;
import java.util.Collections;

public interface Suggestible {

    default Collection<Suggestion> getSuggestions() {
        return Collections.emptySet();
    }
}
