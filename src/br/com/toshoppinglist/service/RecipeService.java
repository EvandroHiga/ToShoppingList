package br.com.toshoppinglist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.toshoppinglist.dao.RecipeDAO;
import br.com.toshoppinglist.modelo.Recipe;

@Service
public class RecipeService {

	private RecipeDAO dao;
	
	@Autowired
	public RecipeService(RecipeDAO dao) {
		this.dao = dao;
	}
	
	public List<Recipe> buscarTodasReceitas() {
		return dao.buscarTodasReceitas();
	}

}
