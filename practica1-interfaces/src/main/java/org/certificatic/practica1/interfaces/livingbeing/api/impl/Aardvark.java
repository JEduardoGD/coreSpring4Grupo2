package org.certificatic.practica1.interfaces.livingbeing.api.impl;

import org.certificatic.practica1.interfaces.livingbeing.api.IBugEater;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper=true)
public class Aardvark extends Animal implements IBugEater {

	public Aardvark(String subType) {
		this.setSubType(subType);
	}

	public void born() {
		System.out.println("born like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	public void breed() {
		System.out.println("breed like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	public void eatBug() {
		System.out.println("eating bug like a " + this.getType() + " (" + this.getSubType() + ")");
	}
}
