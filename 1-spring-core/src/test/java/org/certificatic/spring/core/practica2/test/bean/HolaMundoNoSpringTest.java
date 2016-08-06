package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoNoSpringTest {

	@Test
	public void holaMundoNoSpringTest() {
		log.info("holaMundoNoSpringTest -------------------------");

		// Crear instancia de HolaMundo
		HolaMundo hm1 = new HolaMundo();

		hm1.setMensaje("Hola mundo !");

		System.out.println(hm1);

		HolaMundo hm2 = new HolaMundo("Hola Mundo 2 !");

		System.out.println(hm2);

	}
}
