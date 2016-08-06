package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest2 {

	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");

		String ruta = "spring/practica2/beans.xml";

		// Implementar IoC con ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(ruta);

		HolaMundo hm1 = context.getBean("holaMundoBean", HolaMundo.class);
		HolaMundo hm11 = context.getBean("holaMundoBean", HolaMundo.class);
		
		Assert.assertNotNull(hm1);
		Assert.assertNotNull(hm11);
		
		Assert.assertNotNull(hm1.getMensaje());
		Assert.assertNotNull(hm11.getMensaje());

		Assert.assertSame(hm1, hm11);

		((AbstractApplicationContext) context).close();

	}
}
