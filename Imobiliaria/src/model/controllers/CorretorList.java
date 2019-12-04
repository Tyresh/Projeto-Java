package model.controllers;

import java.util.ArrayList;
import java.util.List;
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
	
	public String toString() {
		String result = "";
		for (Corretor corretor: corretorList) {
			result = result + corretor + "\n";
		}
		return result;
	}
}