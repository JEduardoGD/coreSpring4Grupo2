<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- permitir visualización si el usuario NO está autenticado -->

<security:autorize access="isAnonymous()">
	<div id="login-error" class="error">${errorMessage}</div>

	<!-- agregar action spring security y input names -->
	<form id="form" action="" method="post">
		<fieldset id="personal">
			<legend>Login</legend>
			<label for="j_username">Username:</label> 
			<input id="j_username" name="" type="text" /> <br /> 
			<label for="j_password">Password:</label>
			<input id="j_password" name="" type="password" /> <br />
			<br />
		</fieldset>

		<div align="center">
			<input class="button" type="reset" value="Clear" /> <input
				class="button" type="submit" value="Login" />
		</div>
	</form>
</security:autorize>
<!--  -->

<!-- permitir visualización si el usuario está autenticado -->
<security:autorize access="isAutenticated()">
	<h2>
		¡ User '<!-- agregar usuario de spring authentication --><security:autentication property="principal.username" /> you're already authenticated !
	</h2>
</security:autorize>
	<!-- agregar autorities de spring authentication -->
<!--  -->