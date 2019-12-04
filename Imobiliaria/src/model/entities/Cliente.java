package model.entities;

public class Cliente {
	private String cpf;
	private String telefone;
	private String nome;
	private Corretor corretor;
	
	public Cliente() {
		
	}
	
	public Cliente(String cpf, String telefone, String nome, Corretor corretor) {
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.corretor = corretor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public int getCreciCorretor() {
		return corretor.getCreci();
	}
	
	
	
	
}