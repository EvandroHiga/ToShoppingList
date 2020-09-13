package br.com.toshoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.toshoppinglist.service.RecipeService;

@Controller
public class RecipeController {
	
	
	private RecipeService service;
	
	@Autowired
	public RecipeController(RecipeService service) {
		this.service = service;
	}
	
	@RequestMapping("todasReceitas")
	public String buscarTodasReceitas() {
		service.buscarTodasReceitas();
		
		return "todasReceitas";
	}
}
