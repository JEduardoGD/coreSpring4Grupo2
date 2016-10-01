package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.object;

import java.util.Map;

import javax.sql.DataSource;

import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.certificatic.spring.jdbc.pratica25.domain.entities.User;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class CustomerStoredProcedureCall {

	private SimpleJdbcCall simpleJdbcCall;

	public CustomerStoredProcedureCall(DataSource dataSource,
			String procedureName) {
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource)
				.withProcedureName(procedureName);
	}

	public Customer execute(SqlParameterSource parameterSource) {

		Map<String, Object> out = this.simpleJdbcCall.execute(parameterSource);

		if ((Integer) out.get("#update-count-1") == 0)
			return null;

		User u = new User();
		Customer c = new Customer();

		u.setId(new Long((Integer) out.get("out_user_id")));
		u.setUsername((String) out.get("out_username"));
		u.setPassword((String) out.get("out_password"));

		c.setId(new Long((Integer) out.get("out_customer_id")));
		c.setName((String) out.get("out_name"));
		c.setLastName((String) out.get("out_last_name"));
		c.setUser(u);
		c.getUser().setCustomer(c);

		return c;
	}

}
