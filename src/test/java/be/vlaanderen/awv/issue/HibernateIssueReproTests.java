package be.vlaanderen.awv.issue;

import be.vlaanderen.awv.issue.repro.Person;
import be.vlaanderen.awv.issue.repro.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class HibernateIssueReproTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testNormalQuery() {
        List<Person> people = personRepository.findPeopleNormal();
        assertNotNull(people);
        assertEquals(1, people.size());
    }

    @Test
    void testNativeQuery() {
        List<Person> people = personRepository.findPeopleNative();
        assertNotNull(people);
        assertEquals(1, people.size());
    }

}
