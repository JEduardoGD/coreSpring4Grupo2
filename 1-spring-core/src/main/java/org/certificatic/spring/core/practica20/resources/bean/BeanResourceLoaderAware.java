package org.certificatic.spring.core.practica20.resources.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
// Definir bean componente
@Component
// Implementar ResourceLoaderAware
public class BeanResourceLoaderAware implements ResourceLoaderAware {

	private ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	// Inyectar dependencia Resources
	@Autowired
	private Resources resources;
}
