package com.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.repository.Autores;

@Controller
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	private Autores autores;
	
	
	
	@GetMapping
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("autores/CadastroAutor");
		
		mv.addObject("autores", autores.findAll());

		
		return mv;
		
		
	}
}
