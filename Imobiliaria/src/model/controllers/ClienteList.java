package model.controllers;

import java.util.ArrayList;
import java.util.List;
import model.entities.Cliente;

public class ClienteList {
	private List<Cliente> clienteList;
	
	public ClienteList(){
		clienteList= new ArrayList<>() ;
	}
	
	public void addCliente(Cliente c) {
		clienteList.add(c);
	}
	
	public boolean removeCliente(Cliente c) {
		return clienteList.remove(c);
	}
	
	public Cliente getCliente(int index) {
		return clienteList.get(index);
	}
	
	public void removeCliente(int index) {
		clienteList.remove(index);
	}
	
	public boolean hasElement(Cliente c) {
		return clienteList.contains(c);
	}
	
	public boolean estaVazia() {
		return clienteList.isEmpty();
	}
	
	public Object[] transformaEmArray() {
		return clienteList.toArray();
	}
	
	public String toString() {
		String result = "";
		for (Cliente cliente: clienteList) {
			result = result + cliente + "\n";
		}
		return result;
	}
}