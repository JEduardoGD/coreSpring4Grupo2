package org.certificatic.spring.mvcsecurity.practica32.service.api.impl;

import org.certificatic.spring.mvcsecurity.practica32.service.api.IDataService;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("root-data-service")
public class RootDataService implements IDataService {

	@Override
	// Pre Authorize ROLE_ROOT
	@PostAuthorize("hasRole('ROLE_ROOT')")
	public String getData() {
		log.info("inside RootDataService.getData() --------------");
		return "root DATA ....";
	}

}
