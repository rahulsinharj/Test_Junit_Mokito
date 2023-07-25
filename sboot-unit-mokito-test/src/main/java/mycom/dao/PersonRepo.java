package mycom.dao;

import mycom.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepo extends JpaRepository<Person, Integer>
{
    @Query("SELECT CASE WHEN COUNT(p) >0 THEN TRUE ELSE FALSE END FROM Person p WHERE p.personId = :id")
    Boolean isPersonExistsById(@Param("id") Integer id);

}
