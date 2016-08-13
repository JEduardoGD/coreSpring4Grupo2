package org.certificatic.spring.core.practica9.test.beandefinheritance.bean;

import org.certificatic.spring.core.practica9.beandefinitioninheritance.bean.ConnectionDataBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeanDefinitionInheritanceTest {

	@Test
	public void beanDefinitionInheritanceTest1() {

		log.info("beanDefinitionInheritanceTest1 -------------------");

		// Implementar

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica9/bean-def-inheritance-application-context.xml");

		log.info("context ready -------------------");

		ConnectionDataBase connectionProdBean = applicationContext
				.getBean("connectionProdBean", ConnectionDataBase.class);

		Assert.assertNotNull(connectionProdBean);

		connectionProdBean.showInfo();

		ConnectionDataBase connectionTestBean = applicationContext
				.getBean("connectionTestBean", ConnectionDataBase.class);

		Assert.assertNotNull(connectionTestBean);

		connectionTestBean.showInfo();

		((AbstractApplicationContext) applicationContext).close();
	}

	@Test
	public void beanDefinitionInheritanceTest2() {

		log.info("beanDefinitionInheritanceTest2 -------------------");

		// Implementar

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica9/bean-def-inheritance-application-context2.xml");

		log.info("context ready -------------------");

		ConnectionDataBase connectionProdBean = applicationContext
				.getBean("connectionProdBean", ConnectionDataBase.class);

		Assert.assertNotNull(connectionProdBean);

		connectionProdBean.showInfo();

		ConnectionDataBase connectionTestBean = applicationContext
				.getBean("connectionTestBean", ConnectionDataBase.class);

		Assert.assertNotNull(connectionTestBean);

		connectionTestBean.showInfo();

		((AbstractApplicationContext) applicationContext).close();
	}

}
