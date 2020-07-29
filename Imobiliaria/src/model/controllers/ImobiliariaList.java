package model.controllers;

import java.util.ArrayList;
import java.util.List;

import model.entities.Imobiliaria;

public class ImobiliariaList {
	private List<Imobiliaria> imobiliariaList;
	
	public ImobiliariaList(){
		imobiliariaList= new ArrayList<>() ;
	}
	
	public void addImobiliaria(Imobiliaria i) {
		this.imobiliariaList.add(i);
	}
	
	public boolean removeImobiliaria(Imobiliaria i) {
		return imobiliariaList.remove(i);
	}
	
	public Imobiliaria getImobiliaria(int index) {
		return imobiliariaList.get(index);
	}
	
	public void removeImobiliaria(int index) {
		imobiliariaList.remove(index);
	}
	
	public boolean hasElement(Imobiliaria i) {
		return imobiliariaList.contains(i);
	}
	
	public boolean estaVazia() {
		return imobiliariaList.isEmpty();
	}
	
	public String[] transformaEmArrayDeNomes() {
		String result = "";
		for (Imobiliaria imobiliaria: imobiliariaList) {
			result = result + imobiliaria.getNome() + " ";		
		}
		String[] nomeImobiliaria = result.split(" ");
		return  nomeImobiliaria;  // Como ele separa os nomes por \n, penseieu usar esse split pra criar a array.
	}

	public String toStringOfObject(Object c) {
		String find = "";
		for (int i = 0; i < imobiliariaList.size(); i++) {
			if (this.getImobiliaria(i).getNome().equals(c)) {
				find = this.getImobiliaria(i).toString();
			}
		}
		return find;
	}
	
	public Imobiliaria findImobiliaria (Object imobiliaria) {
		Imobiliaria find = new Imobiliaria();
		for (int i = 0; i < imobiliariaList.size(); i++) {
			if (this.getImobiliaria(i).getNome().equals(imobiliaria)) {
				find = this.getImobiliaria(i);
			}
		}
		return find;
	}
	public String toString() {
		String result = "";
		for (Imobiliaria imobiliaria: imobiliariaList) {
			result = result + imobiliaria + "\n";
		}
		return result;
	}
}