package model.entities;

import model.exceptions.CpfInvalidoException;
import model.exceptions.ValorInvalidoException;

public class Cliente extends Pessoa {
	
	public Cliente(long cpfCliente, long telefoneCliente, String nome) throws ValorInvalidoException, CpfInvalidoException {
		super(nome,telefoneCliente,cpfCliente);
	}
	
	
	
	
	
	
}