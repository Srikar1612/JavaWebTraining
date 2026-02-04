package com.ibm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/**
	 * Maneja las solicitudes que se le hacen a la raíz del sitio
	 * 
	 * @return un objeto {@link ModelAndView} con la respuesta al cliente
	 */
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView mostrarHome() {
		return new ModelAndView("home", "message", "Hello Ibmer!");
	}

	@RequestMapping(path = "/ibm/about", method = RequestMethod.GET)
	public ModelAndView aboutUs() {
		return new ModelAndView("aboutUs", "message", "Hello Ibmer!");
	}

}
