package org.certificatic.spring.core.practica20.test.resources;

import org.certificatic.spring.core.practica20.resources.bean.BeanResourceLoaderAware;
import org.certificatic.spring.core.practica20.test.resources.utils.ResourcesTestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Implementar run with spring-test
@RunWith(SpringJUnit4ClassRunner.class)
// cargar context configuration
@ContextConfiguration(locations = { ResourceLoaderAwareTest.location })
public class ResourceLoaderAwareTest {

	public static final String location = "classpath:/spring/practica20/resources-application-context.xml";

	// Inyectar
	@Autowired
	private BeanResourceLoaderAware beanResourceLoaderAware;

	@Test
	public void loadTextFileResourceLoaderAwareTest() {

		log.info("loadTextFileResourceLoaderAwareTest -------------------");

		// loadTextFile
		ResourcesTestUtils.loadTextFile(
				beanResourceLoaderAware.getResources().getTxtFile());

		ResourcesTestUtils.loadTextFile(
				beanResourceLoaderAware.getResourceLoader().getResource(
						"file:c:/certificatic-resources/my-text-file.txt"));
	}

	@Test
	public void loadPropertiesResourceLoaderAwareTest() {

		log.info("loadPropertiesResourceLoaderAwareTest -------------------");

		// loadPropertiesFile
		ResourcesTestUtils.loadPropertiesFile(
				beanResourceLoaderAware.getResources().getPropertiesFile());

		ResourcesTestUtils.loadPropertiesFile(
				beanResourceLoaderAware.getResourceLoader().getResource(
						"classpath:spring/practica20/my-properties.properties"));
	}

	@Test
	public void loadUrlFileResourceLoaderAwareTest() {

		log.info("loadUrlFileResourceLoaderAwareTest -------------------");

		// loadURLFile
		ResourcesTestUtils.loadURLFile(
				beanResourceLoaderAware.getResources().getUrlFile());

		ResourcesTestUtils.loadURLFile(beanResourceLoaderAware
				.getResourceLoader().getResource("https://spring.io/"));
	}

	@Test
	public void loadAndCopyImageResourceLoaderAwareTest() {

		log.info("loadAndCopyImageResourceLoaderAwareTest -------------------");

		String ruta = "src/main/resources/spring/practica20/copy-resource-loader-aware/";

		// loadAndCopyImage
		ResourcesTestUtils.loadAndCopyImage(
				beanResourceLoaderAware.getResources().getImageFile(), ruta);

		ResourcesTestUtils.loadAndCopyImage(
				beanResourceLoaderAware.getResourceLoader().getResource(
						"file:src/main/resources/spring/practica20/logo.png"),
				ruta);
	}
}
