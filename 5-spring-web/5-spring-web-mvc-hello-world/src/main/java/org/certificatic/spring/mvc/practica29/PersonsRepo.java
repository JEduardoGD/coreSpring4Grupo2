package org.certificatic.spring.mvc.practica29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.certificatic.spring.validation.practica30.parte1.domain.Person;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PersonsRepo {
	private List<Person> persons = Collections
			.synchronizedList(new ArrayList<Person>());
}
