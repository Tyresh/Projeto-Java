package model.controllers;

import java.util.ArrayList;
import java.util.List;
import model.entities.Imovel;

public class ImovelList {
	private List<Imovel> imovelList;
	
	public ImovelList(){
		imovelList= new ArrayList<>() ;
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
	
	public String toString() {
		String result = "";
		for (Imovel imovel: imovelList) {
			result = result + imovel + "\n";
		}
		return result;
	}
}