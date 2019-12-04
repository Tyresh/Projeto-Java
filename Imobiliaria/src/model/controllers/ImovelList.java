package model.controllers;

import java.util.ArrayList;
import java.util.List;

import model.entities.Corretor;
import model.entities.Imovel;

public class ImovelList {
	private List<Imovel> imovelList;
	
	public ImovelList(){
		imovelList= new ArrayList<>();
	}
	
	public void addImovel(Imovel i) {
		imovelList.add(i);
	}
	
	public boolean removeImovel(Imovel i) {
		return imovelList.remove(i);
	}
	
	public Imovel getImovel(int index) {
		return imovelList.get(index);
	}
	
	public void removeImovel(int index) {
		imovelList.remove(index);
	}
	
	public boolean hasElement(Imovel i) {
		return imovelList.contains(i);
	}
	
	public boolean estaVazia() {
		return imovelList.isEmpty();
	}
	
	public String[] transformaEmArrayDeNomes() {
		String result = "";
		for (Imovel imovel: imovelList) {
			result = result + imovel.getNome() + " ";		
		}
		String[] nomeImovel = result.split(" ");
		return  nomeImovel;  // Como ele separa os nomes por \n, penseieu usar esse split pra criar a array.
	}

	public String toStringOfObject(Object c) {
		String find = "";
		for (int i = 0; i < imovelList.size(); i++) {
			if (this.getImovel(i).getNome().equals(c)) {
				find = this.getImovel(i).toString();
			}
		}
		return find;
	}
	
	
	public String toString() {
		String result = "";
		for (Imovel imovel: imovelList) {
			result = result + imovel + "\n";
		}
		return result;
	}
}