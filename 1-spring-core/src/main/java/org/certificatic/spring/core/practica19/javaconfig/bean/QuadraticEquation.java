package org.certificatic.spring.core.practica19.javaconfig.bean;

import javax.inject.Inject;

import org.certificatic.spring.core.practica19.javaconfig.bean.api.IQuadraticEquationService;
import org.certificatic.spring.core.practica19.javaconfig.bean.api.QuadraticEquationResult;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Define Bean prototype
@Component
@Scope("prototype")
public class QuadraticEquation {

	public enum QuadraticEquationValue {
		Ax2, Bx, C
	}

	private double a;
	private double b;
	private double c;

	// Inyecta Dependencia
	@Inject
	private IQuadraticEquationService quadraticService; // para probar en master
														// agregar @Setter
														// @Getter

	public void setValue(double value, QuadraticEquationValue type) {
		switch (type) {
		case Ax2:
			this.a = value;
			break;
		case Bx:
			this.b = value;
			break;
		case C:
			this.c = value;
			break;

		default:
			break;
		}
	}

	public QuadraticEquationResult solve() {
		return this.quadraticService.solve(this.a, this.b, this.c);
	}

	/*public static void main(String[] args) {
		QuadraticEquation qe = new QuadraticEquation();
	
		qe.setQuadraticService(new QuadraticEquationServiceImpl());
	
		qe.setValue(-2, QuadraticEquationValue.Ax2);
		qe.setValue(5, QuadraticEquationValue.Bx);
		qe.setValue(-10, QuadraticEquationValue.C);
	
		System.out.println("ecuacion: " + qe.getQuadraticService()
				.quadraticEquationToString(-2, 5, -10));
		System.out.println("resultado: " + qe.solve());
	}*/
}
