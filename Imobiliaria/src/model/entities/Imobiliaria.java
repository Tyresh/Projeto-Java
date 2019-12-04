package model.entities;

public class Imobiliaria {
	

	private long cnpj;
	private String endereco;
	private String nome;
	
	public Imobiliaria() {
		
	}
	
	public Imobiliaria(long cnpj, String endereco, String nome) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.nome = nome;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "cnpj:" + this.cnpj + "\nendereco:" + this.endereco + "\nnome:" + this.nome;
	}
	
	
	
	
}