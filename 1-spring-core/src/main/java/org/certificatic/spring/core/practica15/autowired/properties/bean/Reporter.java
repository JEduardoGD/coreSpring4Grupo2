package org.certificatic.spring.core.practica15.autowired.properties.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Reporter {

	private @Setter(AccessLevel.NONE) String name;

	private @Setter(AccessLevel.NONE) Integer age;

	private String dni;

	private @Setter(AccessLevel.NONE) Booklet notebook;

	private @Setter(AccessLevel.NONE) Pencil pen;

}
