package org.certificatic.spring.core.practica20.test.resources;

import javax.inject.Inject;

import org.certificatic.spring.core.practica20.resources.bean.Resources;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = "classpath:/spring/practica20/resources-application-context.xml")
public class ResourcesTest {

	@Inject
	private Resources resources;

	@Test
	public void loadTextFileClasspathXmlApplicationContextTest() {

		log.info(
				"loadTextFileClasspathXmlApplicationContextTest -------------------");

		// loadTextFile
	}

	@Test
	public void loadPropertiesFileClasspathXmlApplicationContextTest() {

		log.info(
				"loadPropertiesFileClasspathXmlApplicationContextTest -------------------");

		// loadPropertiesFile
	}

	ResourceLoader a;

	@Test
	public void loadUrlFileClasspathXmlApplicationContextTest() {

		log.info(
				"loadUrlFileClasspathXmlApplicationContextTest -------------------");

		// loadURLFile
	}

	@Test
	public void loadAndCopyImageFileClasspathXmlApplicationContextTest() {

		log.info(
				"loadAndCopyImageFileClasspathXmlApplicationContextTest -------------------");

		// loadAndCopyImage
	}
}
