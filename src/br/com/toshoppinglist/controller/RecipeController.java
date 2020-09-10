package br.com.toshoppinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
	
	@RequestMapping("todasReceitas")
	public String buscarTodasReceitas() {
		return "todasReceitas";
	}
}
