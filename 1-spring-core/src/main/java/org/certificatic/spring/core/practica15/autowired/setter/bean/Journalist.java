package org.certificatic.spring.core.practica15.autowired.setter.bean;

import lombok.Data;

@Data
public class Journalist {
	private String name;
	private Integer age;
	private String dni;

	private NoteBook notebook;
	private Pen pen;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setNotebook(NoteBook notebook) {
		this.notebook = notebook;
	}

	public void setAge(Pen pen) {
		this.pen = pen;
	}

}
