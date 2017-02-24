package br.com.valemobi.beans;

public class TipoMercadoria {
	
	private int id;
	private String nome;
	
	public TipoMercadoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public TipoMercadoria() {
		super();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
