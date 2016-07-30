package org.certificatic.practica1.interfaces.operations.api.impl;

import org.certificatic.practica1.interfaces.operations.api.IAdd;
import org.certificatic.practica1.interfaces.operations.api.ICalculator;
import org.certificatic.practica1.interfaces.operations.api.IDivide;
import org.certificatic.practica1.interfaces.operations.api.IMultiply;
import org.certificatic.practica1.interfaces.operations.api.ISubtract;

public class SimpleCalculator extends Calculator implements IAdd, ISubtract, IMultiply, IDivide {

	@Override
	public ICalculator subtract(double number) {
		this.setAccumulator(this.getAccumulator() - number);
		return this;
	}

	@Override
	public ICalculator add(double number) {
		this.setAccumulator(this.getAccumulator() + number);
		return this;
	}

	@Override
	public ICalculator divide(double number) {
		this.setAccumulator(this.getAccumulator() / number);
		return this;
	}

	@Override
	public ICalculator multiply(double number) {
		this.setAccumulator(this.getAccumulator() * number);
		return this;
	}

}