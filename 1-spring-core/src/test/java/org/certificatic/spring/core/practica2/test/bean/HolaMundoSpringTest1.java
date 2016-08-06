package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest1 {

	@Test
	public void holaMundoNoSpringTest() {
		log.info("holaMundoNoSpringTest -------------------------");

		String ruta = "spring/practica2/beans.xml";

		// Implementar IoC con BeanFactory
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(ruta));
		
		HolaMundo hm1 = (HolaMundo)factory.getBean("holaMundoBean");
		HolaMundo hm2 = (HolaMundo)factory.getBean("holaMundoBean2");
		
		System.out.println(hm1);
		System.out.println(hm2);
		
		System.out.println();
		
		
		hm1.setMensaje("Hola Mundo !");
		
		System.out.println(hm1);
		
		HolaMundo hm11 = (HolaMundo)factory.getBean("holaMundoBean");
		
		System.out.println(hm11);
		
		hm11.setMensaje("Adios mundo cruel !");
		
		System.out.println(hm1);
		System.out.println(hm2);
		
		Assert.assertSame(hm1, hm11);
		Assert.assertNotSame(hm1, hm2);

	}
}
