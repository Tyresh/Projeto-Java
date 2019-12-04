package model.entities;

import model.exceptions.CpfInvalidoException;
import model.exceptions.ValorInvalidoException;

public class Cliente extends Pessoa {
	
	public Cliente() {
		super();
	}
	
	public Cliente(int cpf, int telefone, String nome) throws ValorInvalidoException, CpfInvalidoException {
		super(nome,telefone,cpf);
	}
	
	
	
	
	
	
}