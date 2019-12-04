package model.entities;

import model.exceptions.CpfInvalidoException;
import model.exceptions.ValorInvalidoException;

public class Cliente extends Pessoa {
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, int telefone, long cpf) throws ValorInvalidoException, CpfInvalidoException {
		super(nome,telefone,cpf);
	}
	
	
	
	
	
	
}