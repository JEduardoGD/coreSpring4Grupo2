package org.certificatic.spring.core.practica5.test.scopes;

import org.certificatic.spring.core.practica5.scopes.bean.Persona;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ScopesSpringTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() {
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica5/scopes-application-context.xml");
	}

	@Test
	public void scopeSingletonSpringTest() {

		log.info("scopeSingletonSpringTest -------------------");

		for (int i = 0; i < 10; i++) {
			Persona persona = (Persona) applicationContext
					.getBean("personaSingletonBean");

			if (i >= 5) {
				persona.setNombre("Luis");
			}

			Assert.assertNotNull(persona);

			log.info("persona: {} {} {}", persona, persona.hashCode(),
					System.identityHashCode(persona));
		}

		Persona persona1 = (Persona) applicationContext
				.getBean("personaSingletonBean");

		Persona persona2 = (Persona) applicationContext
				.getBean("personaSingletonBean");

		Assert.assertEquals(persona1, persona2);
		Assert.assertSame(persona1, persona2);
	}

	@Test
	public void scopePrototypeSpringTest() {

		log.info("scopePrototypeSpringTest -------------------");

		Persona persona1 = (Persona) applicationContext
				.getBean("personaPrototypeBean");

		Persona persona2 = (Persona) applicationContext
				.getBean("personaPrototypeBean");

		Assert.assertNotNull(persona1);
		Assert.assertNotNull(persona2);

		log.info("persona: {} {} {}", persona1, persona1.hashCode(),
				System.identityHashCode(persona1));

		log.info("persona: {} {} {}", persona2, persona2.hashCode(),
				System.identityHashCode(persona2));

		Assert.assertEquals(persona1, persona2);
		Assert.assertNotSame(persona1, persona2);

	}
}
