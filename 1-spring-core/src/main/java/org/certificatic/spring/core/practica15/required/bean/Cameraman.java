package org.certificatic.spring.core.practica15.required.bean;

import org.springframework.beans.factory.annotation.Required;

import lombok.Data;

@Data
public class Cameraman {
	private String name;
	private Integer age;
	private String dni;

	// Anotar inyeccion requerida
	@Required
	public void setName(String name) {
		this.name = name;
	}

	// Anotar inyeccion requerida
	@Required
	public void setDni(String dni) {
		this.dni = dni;
	}

}
