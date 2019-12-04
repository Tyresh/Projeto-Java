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
	
	
}
