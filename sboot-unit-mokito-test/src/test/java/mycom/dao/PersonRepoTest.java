package mycom.dao;

import mycom.entity.Person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExistsById()
    {
        Person person = new Person(123, "RahulKumar", "Noida");
        personRepo.save(person);

        Boolean actualResult = personRepo.isPersonExistsById(123);
        System.out.println("ActualResult : "+actualResult);

        assertThat(actualResult).isTrue();

    }

    @BeforeEach
    void setUp()                    // Har ek Test method ke "pehle" ye method chalega
    {
        System.out.println("Setting up - before every Test method");
    }

    @AfterEach
    void tearDown()                 // Har ek Test method ke "baad" ye method chalega
    {
        System.out.println("Tearing down - after every Test method");
    }



}