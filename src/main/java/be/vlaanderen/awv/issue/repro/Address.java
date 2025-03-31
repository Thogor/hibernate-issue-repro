package be.vlaanderen.awv.issue.repro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Address {

    @Column(name = "address_street")
    private String street;

    @ManyToOne
    @JoinColumn(name = "address_country")
    private Country country;

}
