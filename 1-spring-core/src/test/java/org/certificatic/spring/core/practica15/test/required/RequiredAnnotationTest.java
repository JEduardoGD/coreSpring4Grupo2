package org.certificatic.spring.core.practica15.test.required;

import org.certificatic.spring.core.practica15.required.bean.Cameraman;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequiredAnnotationTest {

	@Test
	public void requiredAnnotationTest() {

		log.info("requiredAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-required-application-context.xml";

		// Implementar
		ApplicationContext context = new ClassPathXmlApplicationContext(
				ctxFile);

		Cameraman cameraman = context.getBean("okCameraman", Cameraman.class);

		Assert.assertNotNull(cameraman);

		Assert.assertNotNull(cameraman.getName());

		Assert.assertNull(cameraman.getAge());

		Assert.assertNotNull(cameraman.getDni());

		log.info("cameraman: {}", cameraman);

		((AbstractApplicationContext) context).close();
	}

	@Test(expected = BeanCreationException.class)
	public void badRequiredAnnotationTest() {

		log.info("badRequiredAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-required-application-context.xml";

		// Implementar
		ApplicationContext context = new ClassPathXmlApplicationContext(
				ctxFile);

		Cameraman cameraman = context.getBean("badCameraman", Cameraman.class);

		Assert.fail("Test must have fails");
	}

}
