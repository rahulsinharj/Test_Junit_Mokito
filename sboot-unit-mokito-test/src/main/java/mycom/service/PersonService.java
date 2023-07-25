package mycom.service;

import mycom.dao.PersonRepo;
import mycom.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person p) {
        this.personRepo.save(p);
    }

    public List<Person> getAllPerson() {
        return this.personRepo.findAll();
    }

    public boolean isPersonExistsById(int id)
    {
        boolean b = this.personRepo.isPersonExistsById(id);
        return b;
    }

}
