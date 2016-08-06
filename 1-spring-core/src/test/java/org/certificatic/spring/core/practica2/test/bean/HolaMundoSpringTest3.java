package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest3 {

	private static ApplicationContext context;

	// Instanciar ApplicationContext Antes de ejecutar la clase de test
	@Before
	public void beforeTests() {
		String ruta = "spring/practica2/beans.xml";

		context = new ClassPathXmlApplicationContext(ruta);
	}

	@Test
	public void holaMundoSpringTest1() {
		log.info("holaMundoSpringTest1 -------------------------");

		// Implementar IoC con ApplicationContext

		HolaMundo hm1 = context.getBean("holaMundoBean", HolaMundo.class);
		HolaMundo hm11 = context.getBean("holaMundoBean", HolaMundo.class);

		Assert.assertNotNull(hm1);
		Assert.assertNotNull(hm11);

		((AbstractApplicationContext) context).close();

	}

	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");

		// Implementar IoC con ApplicationContext

		HolaMundo hm1 = context.getBean("holaMundoBean", HolaMundo.class);
		HolaMundo hm11 = context.getBean("holaMundoBean", HolaMundo.class);

		Assert.assertNotNull(hm1.getMensaje());
		Assert.assertNotNull(hm11.getMensaje());

		((AbstractApplicationContext) context).close();

	}

	@Test
	public void holaMundoSpringTest3() {
		log.info("holaMundoSpringTest3 -------------------------");

		// Implementar IoC con ApplicationContext

		HolaMundo hm1 = context.getBean("holaMundoBean", HolaMundo.class);
		HolaMundo hm11 = context.getBean("holaMundoBean", HolaMundo.class);

		Assert.assertSame(hm1, hm11);

		((AbstractApplicationContext) context).close();

	}
}
