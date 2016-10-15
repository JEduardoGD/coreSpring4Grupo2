package org.certificatic.spring.mvc.practica29.controller;

import java.util.Date;

import org.certificatic.spring.mvc.practica29.PersonsRepo;
import org.certificatic.spring.validation.practica30.parte1.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@Scope("session")
// Implementar request mapping "/person2"
@RequestMapping("/person2")
class PersonController2 {

	@Autowired
	private PersonsRepo personsRepo;

	private Person personCreated;
	private Date date;

	// Implementar request mapping "/" y "" por metodo GET
	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String showPersonsPage(Model model) {

		log.info("showPersonsPage ---------------->");

		// Agregar la coleccion persons al modelo
		model.addAttribute("persons", personsRepo.getPersons());

		// Agregar comando "personForm"
		Person p = new Person();
		p.setName("Escribe tu nombre");

		model.addAttribute("personForm", p);

		return "person/list_and_create_person2";
	}

	// Implementar request mapping "/create" por metodo POST
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	// Recibir como argumento el Person que proviene del formulario
	public String createPerson(Model model,
			@ModelAttribute("personForm") Person personForm) {

		log.info("createPerson ---------------->");

		log.info("processing form ...............");

		// Agregar el person que proviene del formulario al listado "persons"
		personsRepo.getPersons().add(personForm);

		// Agregar "personCreated" al modelo siendo éste objeto el obtenido
		// desde el formulario
		model.addAttribute("personCreated", personForm);
		this.personCreated = personForm;

		// Agregar "servertime" (new Date()) al modelo
		Date date = new Date();
		model.addAttribute("servertime", date);
		this.date = date;

		// return "person/show_person_data"; // forward
		return "redirect:/person2/showdata"; // sendRedirect
	}

	// En sessiones es necesario obtener los objetos de la sesión mediante el
	// valor explicito sobre la anotación @ModelAttribute.
	// Implementar request mapping "/showdata" por metodo GET
	@RequestMapping(value = "/showdata", method = RequestMethod.GET)
	public String showPerson(Model model) {

		log.info("showPerson ---------------->");

		// Se vuelven a agregar los datos al modelo para que sean accesibles en
		// la vista
		model.addAttribute("personCreated", this.personCreated);
		model.addAttribute("servertime", this.date);

		return "person/show_person_data2";
	}

}