package pl.techstyle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.techstyle.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
