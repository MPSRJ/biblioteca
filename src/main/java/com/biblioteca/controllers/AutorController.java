package com.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.model.Autor;
import com.biblioteca.repository.Autores;

@Controller
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	private Autores autores;
	
	
	
	@GetMapping
	public ModelAndView listar(Autor autor){
		ModelAndView mv = new ModelAndView("autores/CadastroAutor");
		
		mv.addObject("autores", autores.findAll());

		
		return mv;
		
		
	}
	
	@PostMapping
	public ModelAndView salvar(Autor autor){
			
		autores.save(autor);
		
		return new ModelAndView("redirect:/autores");
	}
	
	
}
