package model.controllers;

import java.util.ArrayList;
import java.util.List;

import model.entities.Cliente;
import model.entities.Corretor;

public class CorretorList {
	private List<Corretor> corretorList;
	
	public CorretorList(){
		corretorList= new ArrayList<>() ;
	}
	
	public void addCorretor(Corretor c) {
		corretorList.add(c);
	}
	
	public boolean removeCorretor(Corretor c) {
		return corretorList.remove(c);
	}
	
	public Corretor getCorretor(int index) {
		return corretorList.get(index);
	}
	
	public void removeCorretor(int index) {
		corretorList.remove(index);
	}
	
	public boolean hasElement(Corretor c) {
		return corretorList.contains(c);
	}
	
	public boolean estaVazia() {
		return corretorList.isEmpty();
	}
	
	public String[] transformaEmArrayDeNomes() {
		String result = "";
		for (Corretor corretor: corretorList) {
			result = result + corretor.getNome() + " ";		
		}
		String[] nomeCorretor = result.split(" ");
		return  nomeCorretor;  // Como ele separa os nomes por \n, penseieu usar esse split pra criar a array.
	}

	public String toStringOfObject(Object c) {
		String find = "";
		for (int i = 0; i < corretorList.size(); i++) {
			if (this.getCorretor(i).getNome().equals(c)) {
				find = this.getCorretor(i).toString();
			}
		}
		return find;
	}
	
	public Corretor findCorretor (Object corretor) {
		Corretor find = new Corretor();
		for (int i = 0; i < corretorList.size(); i++) {
			if (this.getCorretor(i).getNome().equals(corretor.toString())) {
				find = this.getCorretor(i);
			}
		}
		return find;
	}
	public String toString() {
		String result = "";
		for (Corretor corretor: corretorList) {
			result = result + corretor + "\n";
		}
		return result;
	}
}