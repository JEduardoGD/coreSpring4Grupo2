package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.certificatic.spring.jdbc.pratica25.domain.entities.User;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customer c = new Customer();
		User u = new User();

		c.setId(rs.getLong("CUSTOMER_ID"));
		c.setName(rs.getString("NAME"));
		c.setLastName(rs.getString("LAST_NAME"));

		u.setId(rs.getLong("USER_ID"));
		u.setUsername(rs.getString("USERNAME"));
		u.setPassword(rs.getString("PASSWORD"));

		u.setCustomer(c);
		c.setUser(u);

		return c;
	}

}
