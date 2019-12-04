package model.entities;

public abstract class Pessoa {
	protected String nome;
	protected int telefone;
	protected int cpf;
	
	public Pessoa(String nome, int telefone, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}	
	
}
