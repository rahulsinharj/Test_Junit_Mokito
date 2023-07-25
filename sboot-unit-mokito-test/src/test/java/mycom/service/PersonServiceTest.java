package mycom.service;

import mycom.dao.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)          // ye annototion lagaye hai, Taaki Mokito wale "verify" method kaam kar sake.
class PersonServiceTest {

    @Mock                               // Mock matlab dikhawati
    private PersonRepo personRepo;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.personRepo);
    }

    @Test                   // Testing
    void getAllPerson() {
        personService.getAllPerson();

        verify(personRepo).findAll();

    }


}