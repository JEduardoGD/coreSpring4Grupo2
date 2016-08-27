package org.certificatic.spring.core.practica18.test.jsr330;

import javax.inject.Inject;

import org.certificatic.spring.core.practica18.jsr330.bean.Corporation;
import org.certificatic.spring.core.practica18.jsr330.bean.api.impl.Director;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Implementar run with spring-test
@RunWith(SpringJUnit4ClassRunner.class)
// cargar context configuration
@ContextConfiguration("classpath:/spring/practica18/annotations-jsr330-application-context.xml")
public class Jsr330AnnotationTest {

	// Inyectar
	@Inject
	private Corporation corporation;

	public void beforeClass() {
		Assert.assertNotNull(corporation);
	}

	@Test
	public void jsr330AnnotationTest() {

		log.info("jsr330AnnotationTest -------------------");

		Assert.assertNotNull(corporation);

		Assert.assertNotNull(corporation.getItDirector());
		Assert.assertNotNull(((Director)corporation.getItDirector()).getEmployee());
		Assert.assertNotNull(((Director)corporation.getItDirector()).getBudget());
		
		Assert.assertNotNull(corporation.getGeneralDirector());
		Assert.assertNotNull(((Director)corporation.getGeneralDirector()).getEmployee());
		Assert.assertNotNull(((Director)corporation.getGeneralDirector()).getBudget());
		
		Assert.assertNotNull(corporation.getSecretaryAssistant());
		Assert.assertNotNull(corporation.getSecretaryAssistant().getEmployee());
		
		Assert.assertFalse(corporation.getGeneralSecretary().isPresent());
		
		Assert.assertNotNull(corporation.getManager());
		Assert.assertNotNull(corporation.getManager().getEmployee());
		
		Assert.assertNotNull(corporation.getManager().getTeam1());
		Assert.assertNotNull(corporation.getManager().getTeam1().getEmployees());
		Assert.assertNotNull(corporation.getManager().getTeam1().getArchitect());
		Assert.assertNotNull(corporation.getManager().getTeam1().getProgrammer());
		Assert.assertNotNull(corporation.getManager().getTeam1().getTester());
		
		Assert.assertNotNull(corporation.getManager().getTeam2());
		Assert.assertNotNull(corporation.getManager().getTeam2().getEmployees());
		Assert.assertNotNull(corporation.getManager().getTeam2().getArchitect());
		Assert.assertNotNull(corporation.getManager().getTeam2().getProgrammer());
		Assert.assertNotNull(corporation.getManager().getTeam2().getTester());
		
		Assert.assertSame(corporation.getManager().getTeam1().getArchitect(), corporation.getManager().getTeam2().getArchitect());
		Assert.assertSame(corporation.getManager().getTeam1().getProgrammer(), corporation.getManager().getTeam2().getProgrammer());
		Assert.assertSame(corporation.getManager().getTeam1().getTester(), corporation.getManager().getTeam2().getTester());

		log.info("corporation: {}", corporation);
	}

}
