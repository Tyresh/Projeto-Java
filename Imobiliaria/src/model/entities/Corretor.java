package model.entities;

import model.exceptions.CpfInvalidoException;
import model.exceptions.ValorInvalidoException;

public class Corretor extends Pessoa {

	private Imobiliaria imobiliaria;
	private int creci;	
	
	public Corretor(long cpfCorretor, long telefoneCorretor, String nomeCorretor, int creciCorretor) {
		super();
	}
	
	public Corretor(int creci, long telefone, String nome, Imobiliaria imobiliaria, long cpf) throws
	ValorInvalidoException, CpfInvalidoException  {
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

	public String getCnpjImobiliaria() {
		return imobiliaria.getCnpj();
	}
	
	public String toString() {
		return "Corretor creci:" + this.creci + "\ntelefone:" + this.getTelefone() + 
				"\nnome=" + this.getNome() + "\nimobiliaria=" + this.imobiliaria;
	}
}