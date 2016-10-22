package org.certificatic.spring.mvcsecurity.practica32.service.api.impl;

import org.certificatic.spring.mvcsecurity.practica32.service.api.IDataService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("admin-data-service")
public class AdminDataService implements IDataService {

	@Override
	// Pre Authorize ROLE_ADMIN
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getData() {
		log.info("inside AdminDataService.getData() --------------");
		return "admin DATA ....";
	}

}
