package model.entities;

public class Cliente extends Pessoa {
	
	private Corretor corretor;
	

	public Cliente(int cpf, int telefone, String nome, Corretor corretor) {
		super(nome,telefone,cpf);
		this.corretor = corretor;
		
		
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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

	public int getCreciCorretor() {
		return corretor.getCreci();
	}
	
	public String toString() {
		return "cpf:" + this.cpf + "\ntelefone:" + this.telefone + "\nnome:" 
	            + this.nome + "\ncorretor:" + this.corretor ;
	}
	
	
	
	
}