package pl.techstyle.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Controller;

import pl.techstyle.Model.Person;
import pl.techstyle.Repository.PersonRepository;

@Controller
public class PersonService {
		
		@Autowired
		PersonRepository repo;
		
		public List<Person> getAllFemale(){	
			Person filter= new Person();
			filter.setName("a");
			ExampleMatcher exampleMatcher =ExampleMatcher.matching()
					.withStringMatcher(StringMatcher.ENDING)
					.withIgnoreCase();
			Example<Person> example;
			example=Example.of(filter,exampleMatcher);
			System.out.println(example.toString());
			Iterable<Person> literalePerson= repo.findAll(example);
			List<Person> listPerson= new ArrayList<>();
			literalePerson.forEach((t)->{
				listPerson.add(t);
				System.out.println(t.toString());
			});
			return listPerson;
		}
		public List<Person> getCities(String city){	
			Person filter= new Person();
			filter.setAdress(city);
			ExampleMatcher exampleMatcher =ExampleMatcher.matching()
					.withStringMatcher(StringMatcher.CONTAINING)
					.withIgnoreCase();
			Example<Person> example;
			example=Example.of(filter,exampleMatcher);
			Iterable<Person> literalePerson= repo.findAll(example);
			List<Person> listPerson= new ArrayList<>();
			literalePerson.forEach((t)->{
				listPerson.add(t);
			});
			return listPerson;
		}
}
