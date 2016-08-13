package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.api.IWorker;
import org.certificatic.spring.core.practica10.beanpostprocessors.bean.proxy.WorkerProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor4 implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("[Bean Post Process After Initialization "
				+ this.getOrder() + "]");

		System.out.println("[BPP] bean name: " + beanName);

		if (bean instanceof IWorker) {
			IWorker w = (IWorker) bean;

			WorkerProxy wp = new WorkerProxy();

			wp.setProxiedWorker(w);

			wp.setAge(30);
			wp.setName("Chuck Norris");

			bean = wp;

		}

		return bean;
	}

	@Override
	public int getOrder() {
		return 4;
	}

}