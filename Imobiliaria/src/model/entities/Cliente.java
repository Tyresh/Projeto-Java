package model.entities;

public class Cliente extends Pessoa {
	
	private Corretor corretor;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int cpf, int telefone, String nome, Corretor corretor) {
		super(nome,telefone,cpf);
		this.corretor = corretor;
	}

	public int getCreciCorretor() {
		return corretor.getCreci();
	}
	
	
	
	
	
	
}