package model.controllers;

import java.util.ArrayList;
import java.util.List;
import model.entities.Contrato;

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
	
	public String toString() {
		String result = "";
		for (Contrato contrato: contratoList) {
			result = result + contrato + "\n";
		}
		return result;
	}
}