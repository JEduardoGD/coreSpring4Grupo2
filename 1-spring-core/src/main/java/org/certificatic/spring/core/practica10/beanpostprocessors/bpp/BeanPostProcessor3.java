package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.Worker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor3 implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("[Bean Post Process Before Initialization "
				+ this.getOrder() + "]");

		System.out.println("[BPP] bean name: " + beanName);

		if (bean instanceof Worker) {
			Worker w = (Worker) bean;

			System.out.println("[BPP] Worker name: " + w.getName());

			w.setName("Fake worker name 3");

			System.out.println("[BPP] changing name....");

			System.out.println("[BPP] Changed Worker name: " + w.getName());
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("[Bean Post Process After Initialization "
				+ this.getOrder() + "]");

		System.out.println("[BPP] bean name: " + beanName);

		if (bean instanceof Worker) {
			Worker w = (Worker) bean;

			System.out.println("[BPP] Worker name: " + w.getName());

			w.setName("Great worker name 3");

			System.out.println("[BPP] changing name....");

			System.out.println("[BPP] Changed Worker name: " + w.getName());
		}

		return bean;
	}

	@Override
	public int getOrder() {
		return 3;
	}

}