package model.entities;

public class Corretor extends Pessoa {

	private Imobiliaria imobiliaria;
	private int creci;
	
	
	
	
	public Corretor(int creci, int telefone, String nome, Imobiliaria imobiliaria, int cpf) {
		super(nome, telefone,cpf);
		this.creci = creci;
		this.imobiliaria= imobiliaria;
		
		
	}

	public int getCreci() {
		return creci;
	}

	public void setCreci(int creci) {
		this.creci = creci;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
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
	
	public String toString() {
		return "Corretor creci:" + this.creci + "\ntelefone:" + this.telefone + 
				"\nnome=" + this.nome + "\nimobiliaria=" + this.imobiliaria;
	}
}