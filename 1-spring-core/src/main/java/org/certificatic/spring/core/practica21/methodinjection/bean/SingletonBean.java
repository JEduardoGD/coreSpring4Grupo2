package org.certificatic.spring.core.practica21.methodinjection.bean;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonBean {

	// Define la estructura para inyectar métodos en éste bean
	private @Setter Integer iterations;

	public String process(String data) {
		log.info("SingletonBean id [{}]: sending to process data ...",
				super.hashCode());

		// Inyecta un prototype IProcessor en este bean singleton
		return null;
	}

}
