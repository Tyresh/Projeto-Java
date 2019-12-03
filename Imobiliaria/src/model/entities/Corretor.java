package model.entities;

public class Corretor {
	private int creci;
	private String telefone;
	private String nome;
	private Imobiliaria imobiliaria;
	
	public Corretor(int creci, String telefone, String nome, Imobiliaria imobiliaria) {
		super();
		this.creci = creci;
		this.telefone = telefone;
		this.nome = nome;
		this.imobiliaria = imobiliaria;
	}

	public int getCreci() {
		return creci;
	}

	public void setCreci(int creci) {
		this.creci = creci;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpjImobiliaria() {
		return imobiliaria.getCnpj();
	}
}