package br.com.toshoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.toshoppinglist.service.RecipeService;

@Controller
public class RecipeController {
	
	private RecipeService service;
	
	@Autowired
	public RecipeController(RecipeService service) {
		this.service = service;
	}
	
	@RequestMapping("/test")
	public String test() {
		return "testPage";
	}
	
	@RequestMapping("/todasReceitas")
	public ModelAndView buscarTodasReceitas() {
		ModelAndView modelAndView = service.buscarTodasReceitas();
		return modelAndView;
	}
	
}
