package be.vlaanderen.awv.issue.repro;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    private final EntityManager entityManager;

    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Person> findPeopleNormal() {
        return entityManager
                .createQuery("select p from Person p", Person.class)
                .getResultList();
    }

    public List<Person> findPeopleNative() {
        Session session = entityManager.unwrap(Session.class);
        return session.createNativeQuery("SELECT {p.*} FROM person p", Person.class)
                .addEntity("p", Person.class)
                .list();
    }

}
