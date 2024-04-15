package br.com.toshoppinglist.model;

public class Recipe {
	private int idReceita;
	private String nomeReceita;
	private String modoPreparoReceita;
	
	public int getIdReceita() {
		return idReceita;
	}
	
	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
	}
	
	public String getNomeReceita() {
		return nomeReceita;
	}
	
	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}
	
	public String getModoPreparoReceita() {
		return modoPreparoReceita;
	}
	
	public void setModoPreparoReceita(String modoPreparoReceita) {
		this.modoPreparoReceita = modoPreparoReceita;
	}
	
}