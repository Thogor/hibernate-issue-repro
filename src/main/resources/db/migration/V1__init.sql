CREATE TABLE IF NOT EXISTS country
(
    code TEXT PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS person
(
    id              UUID PRIMARY KEY,
    name            TEXT NOT NULL,
    address_street  TEXT NOT NULL,
    address_country TEXT REFERENCES country(code)
);

INSERT INTO country(code, name)
VALUES ('BE', 'Belgium');

INSERT INTO person (id, name, address_street, address_country)
VALUES (gen_random_uuid(), 'John Doe', 'Baker street', 'BE');
