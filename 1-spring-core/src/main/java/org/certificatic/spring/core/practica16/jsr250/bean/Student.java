package org.certificatic.spring.core.practica16.jsr250.bean;

import lombok.Data;

@Data
public class Student {

	private String name;

	private String enrollment;

	private Subject subject;

	private Subject mathematics;

	public void postConstructCallback() {
		System.out.println("Initializing Student Bean");
	}

	public void preDestroyCallback() {
		System.out.println("Destroying Student Bean");
	}

}
