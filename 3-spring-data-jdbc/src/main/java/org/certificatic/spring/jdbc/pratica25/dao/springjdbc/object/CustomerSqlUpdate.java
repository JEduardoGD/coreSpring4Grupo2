package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.object;

import java.sql.Types;

import javax.sql.DataSource;

import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class CustomerSqlUpdate extends SqlUpdate {

	private static final String UPDATE = "UPDATE SPRING_DATA_CUSTOMER_TBL SET NAME = ?, LAST_NAME = ? WHERE CUSTOMER_ID = ?";

	public CustomerSqlUpdate(DataSource dataSource) {

		super(dataSource, UPDATE);
		this.declareParameter(new SqlParameter("NAME", Types.VARCHAR));
		this.declareParameter(new SqlParameter("LAST_NAME", Types.VARCHAR));
		this.declareParameter(new SqlParameter("CUSTOMER_ID", Types.INTEGER));

		this.compile();
	}

	public int execute(Long id, String name, String lastName) {
		return this.update(name, lastName, id);
	}

	public int execute(Customer customer) {
		return this.update(customer.getName(), customer.getLastName(),
				customer.getId());
	}

}
