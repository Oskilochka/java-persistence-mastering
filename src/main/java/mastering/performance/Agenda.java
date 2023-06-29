package mastering.performance;

import java.util.List;
import java.util.Map;

public class Agenda {
    private Long id;
    private String name;

    // relation DB:
    // one to mane
    private List<Contact> contacts;

    // no relation (for e.g MongoDb)
    private Map<String, String> contactsList;
}
