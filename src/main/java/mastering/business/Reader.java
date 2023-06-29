package mastering.business;

import java.util.Optional;

public class Reader {
    private String id;
    private String name;
    private String language;
    private DriverLicense driverLicense;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public Optional<DriverLicense> getDriverLicense() {
        return Optional.ofNullable(driverLicense);
    }
}
