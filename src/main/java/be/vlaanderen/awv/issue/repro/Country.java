package be.vlaanderen.awv.issue.repro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {

    @Id
    private String code;

    private String name;

}
