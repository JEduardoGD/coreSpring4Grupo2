package org.certificatic.practica1.interfaces.livingbeing.api.impl;

import org.certificatic.practica1.interfaces.livingbeing.api.IBugEater;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper=true)
public class VenusFlyTrap extends Plant implements IBugEater {

	public VenusFlyTrap(String subType) {
		this.setSubType(subType);
	}

	public void eatBug() {
		System.out.println("eating bug like a " + this.getType() + " (" + this.getSubType() + ")");
	}
}
