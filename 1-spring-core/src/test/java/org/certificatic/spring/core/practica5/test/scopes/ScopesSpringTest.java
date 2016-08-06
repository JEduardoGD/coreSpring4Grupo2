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
		// Instanciar ApplicationContext
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica5/scopes-application-context.xml");
	}

	@Test
	public void scopeSingletonSpringTest() {

		log.info("scopeSingletonSpringTest -------------------");

		// Implementar
		Persona person1 = applicationContext.getBean("personaSingletonBean",
				Persona.class);
		Persona person2 = applicationContext.getBean("personaSingletonBean",
				Persona.class);

		Assert.assertNotNull(person1);
		Assert.assertNotNull(person2);

		Assert.assertEquals(person1, person2);
		Assert.assertSame(person1, person2);

		for (int i = 0; i < 3; i++) {
			Persona p = applicationContext.getBean("personaSingletonBean",
					Persona.class);

			Assert.assertNotNull(p);
			log.info("persona: {} {} {}", p, p.hashCode(),
					System.identityHashCode(p));
		}

	}

	@Test
	public void scopePrototypeSpringTest() {

		log.info("scopePrototypeSpringTest -------------------");

		// Implementar
		Persona person1 = applicationContext.getBean("personaPrototypeBean",
				Persona.class);
		Persona person2 = applicationContext.getBean("personaPrototypeBean",
				Persona.class);

		Assert.assertNotNull(person1);
		Assert.assertNotNull(person2);

		Assert.assertEquals(person1, person2);
		Assert.assertNotSame(person1, person2);

		for (int i = 0; i < 3; i++) {
			Persona p = applicationContext.getBean("personaPrototypeBean",
					Persona.class);

			Assert.assertNotNull(p);
			log.info("persona: {} {} {}", p, p.hashCode(),
					System.identityHashCode(p));
		}

	}
}
