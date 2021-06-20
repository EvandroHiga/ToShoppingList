package br.com.toshoppinglist.model;

import java.util.Calendar;

public class Recipe {
	private int id_receita;
	private String nome_receita;
	private String modo_preparo_receita;
	private Calendar data_receita;
	
	public int getId_receita() {
		return id_receita;
	}
	
	public void setId_receita(int id_receita) {
		this.id_receita = id_receita;
	}
	
	public String getNome_receita() {
		return nome_receita;
	}
	
	public void setNome_receita(String nome_receita) {
		this.nome_receita = nome_receita;
	}
	
	public String getModo_preparo_receita() {
		return modo_preparo_receita;
	}
	
	public void setModo_preparo_receita(String modo_preparo_receita) {
		this.modo_preparo_receita = modo_preparo_receita;
	}
	
	public Calendar getData_receita() {
		return data_receita;
	}
	
	public void setData_receita(Calendar data_receita) {
		this.data_receita = data_receita;
	}
	
}
