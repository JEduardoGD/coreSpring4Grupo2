package org.certificatic.practica1.interfaces.livingbeing.api.impl;

import org.certificatic.practica1.interfaces.livingbeing.api.ILivingBeing;

import lombok.Data;

@Data
public abstract class Animal implements ILivingBeing {
	private String type = "Animal";
	private String subType;
	
	public void grow() {
		System.out.println("grow like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	public void die() {
		System.out.println("die like a " + this.getType() + " (" + this.getSubType() + ")");
	}
}
