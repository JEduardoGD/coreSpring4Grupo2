package org.certificatic.spring.core.practica15.autowired.requiredFalse.qualifier.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Airplane {

	private @Setter(AccessLevel.NONE) String airplaneCode;

	private @Setter(AccessLevel.NONE) Airline airline;

}
