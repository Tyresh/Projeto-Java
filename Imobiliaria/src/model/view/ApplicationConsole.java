package model.view;

import model.controllers.*;
import model.entities.*;
import model.enums.*;

public class ApplicationConsole {
	public static void main (String[] args) {
		
		ImovelList imovelList = new ImovelList();
		Imovel lego = new Imovel(1024, "CASA", "ALUGADO","Rua dos Bobos", "Lego", 40000);
		Imovel playmobil = new Imovel(2045, "APARTAMENTO", "VENDIDO", "Rua dos Trouxa", "Playmobil", 50000);
		
		imovelList.addImovel(lego);
		imovelList.addImovel(playmobil);
		
		System.out.print(imovelList);
	}
}
