package model.entities;

import model.enums.TipoContrato;

public class Contrato {
	private int numero;
	private TipoContrato tipoContrato;
	private boolean fiador;
	private Corretor corretor;
	private Cliente cliente;
	private Imovel imovel;
	
	public Contrato() {
		
	}
	
	public Contrato(int numero, TipoContrato tipoContrato, boolean fiador, Corretor corretor, Cliente cliente,
			       Imovel imovel) {
		this.numero = numero;
		this.tipoContrato = tipoContrato;
		this.fiador = fiador;
		this.corretor = corretor;
		this.cliente = cliente;
		this.imovel = imovel;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public boolean isFiador() {
		return fiador;
	}

	public void setFiador(boolean fiador) {
		this.fiador = fiador;
	}

	public int getCreciCorretor() {
		return corretor.getCreci();
	}

	public int getCpfCliente() {
		return cliente.getCpf();
	}

	public int getMatriculaImovel() {
		return imovel.getMatricula();
	}

	public String toString() {
		return "Contrato numero:" + this.numero + " \ntipoContrato:" + this.tipoContrato + "\nfiador:" + this.fiador 
				+ "\ncorretor:"+ this.corretor + "\ncliente:" + this.cliente + "\nimovel:" + this.imovel;
	}	
	
}