package org.certificatic.spring.core.practica8.factorymethod.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Student {
	private @Setter(AccessLevel.PRIVATE) String name;
	private @Setter(AccessLevel.PRIVATE) Subject subject;

	private Student() {
	}

	public static Student constructStudent(String name, String materia) {
		Student a = new Student();
		a.setName(name);
		a.setSubject(new Subject());
		a.getSubject().setName(materia);
		a.getSubject().setTeacher(new Teacher());
		a.getSubject().getTeacher().setName("Julia");
		return a;
	}

}
