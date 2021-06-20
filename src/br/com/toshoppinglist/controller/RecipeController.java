package br.com.toshoppinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
	
	@RequestMapping("test")
	public String buscarTodasReceitas() {
		return "testPage";
	}
}
