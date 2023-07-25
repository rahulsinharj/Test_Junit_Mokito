package mycom;

import mycom.entity.Person;
import mycom.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println("Mockito and UnitTest Application running ! ");

/*		Person s1 = new Person(108, "Mita", "Gurgaon");
		Person s2 = new Person(109, "Sita", "Punjab");

		this.personService.savePerson(s1);
		this.personService.savePerson(s2);
*/

		List<Person> allPersons = this.personService.getAllPerson();
		allPersons.forEach(System.out::println);

		boolean personIfPresent = this.personService.isPersonExistsById(105);
		System.out.println("PersonIfPresent : "+personIfPresent);



	}
}
