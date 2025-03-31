Run `mvn clean test` to reproduce the issue.

See `Person`, `Address`, and `Country` for the entity and embeddable mappings that cause the issue.
See `PersonRepository#findPeopleNative()` for the query that causes the issue.
See `HibernateIssueReproTest` for the test code.
