package teapot.models;

import teapot.utils.RequirementHandler;

import java.util.Objects;

public record CommandRequest(String abbreviation, String... args) {
    public CommandRequest(final String abbreviation, final String... args) {
        this.abbreviation = RequirementHandler.requireNonEmptyString(abbreviation);
        this.args = args;
    }

}
