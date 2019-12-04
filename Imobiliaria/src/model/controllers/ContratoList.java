package model.controllers;

import java.util.ArrayList;
import java.util.List;

import model.entities.Contrato;
import model.exceptions.ValorNaoExisteException;

public class ContratoList {
	private List<Contrato> contratoList;
	
	public ContratoList(){
		contratoList= new ArrayList<>() ;
	}
	
	public void addContrato(Contrato c) {
		contratoList.add(c);
	}
	
	public boolean removeContrato(Contrato c) {
		return contratoList.remove(c);
	}
	
	public Contrato getContrato(int index) {
		return contratoList.get(index);
	}
	
	public void removeContrato(int index) {
		contratoList.remove(index);
	}
	
	public boolean hasElement(Contrato c) {
		return contratoList.contains(c);
	}
	
	public boolean estaVazia() {
		return contratoList.isEmpty();
	}
	
	public int[] transformaEmArrayDeNumeros() {
		String result = "";
		for (Contrato contrato: contratoList) {
			result = result + Integer.toString(contrato.getNumero()) + " ";	
		}
		String[] ArrayDeStrings = result.split(" ");
	    int[] numeroCorretor = new int[ArrayDeStrings.length];
		return  numeroCorretor;  // Como ele separa os nomes por \n, penseieu usar esse split pra criar a array.
	}
	
	public Contrato findContratoByNumero (int numero) throws ValorNaoExisteException {
		Contrato contrato = new Contrato();
		for (Contrato c : contratoList) {
			if(c.getNumero() == numero) {
				contrato = c;
			} else {
				throw new ValorNaoExisteException("Valor não existe!");
			}
		}
		return contrato;
	}
	
	public String toString() {
		String result = "";
		for (Contrato contrato: contratoList) {
			result = result + contrato + "\n";
		}
		return result;
	}
}