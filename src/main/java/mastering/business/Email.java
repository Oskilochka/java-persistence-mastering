package mastering.business;

import java.util.Objects;

public record Email(String value) {

    public Email {
        Objects.requireNonNull(value, "email is required");
        // email validation
    }
}
