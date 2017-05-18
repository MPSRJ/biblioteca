package com.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.repository.Livros;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private Livros livros;

	@GetMapping
	public ModelAndView inicio() {

		ModelAndView mv = new ModelAndView("homepage");

		mv.addObject("livros", livros.findAll());

		return mv;
	}

}
