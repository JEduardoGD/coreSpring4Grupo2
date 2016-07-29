package org.certificatic.spring.core.practica18.test.jsr330;

import org.certificatic.spring.core.practica18.jsr330.bean.Corporation;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Implementar spring-test
public class Jsr330AnnotationTest {

	private Corporation corporation;

	public void beforeClass() {
		Assert.assertNotNull(corporation);
	}

	@Test
	public void jsr330AnnotationTest() {

		log.info("jsr330AnnotationTest -------------------");

		Assert.assertNotNull(corporation);

		log.info("corporation: {}", corporation);
	}

}
