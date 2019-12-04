package model.view;

import model.controllers.*;
import model.entities.*;
import model.enums.*;

public class ApplicationConsole {
	public static void main (String[] args) {
		
		Imobiliaria imob1 = new Imobiliaria("12345678901113", "Rua saudades dela", "Lego");
		Imobiliaria imob2 = new Imobiliaria("21345678901113", "Rua foda que ela é linda",
				"Playmobil");	
		Imovel imovel1 = new Imovel(122134, "CASA","DISPONIVEL", "Rua 3",
				"Castelo do Drácula", 300000,imob1);
		Imovel imovel2 = new Imovel(451241, "APARTAMENTO", "DISPONIVEL", "Rua 2",
				"Castelo Ratimbum", 40000,imob2);
		Imovel imovel3 = new Imovel(482951, "COMERCIO", "DISPONIVEL", "Rua 3",
				"Casa dos Instrumentos", 140000, imob1);
		Imovel imovel4 = new Imovel(649275, "CASA", "DISPONIVEL", "Rua 4", 
				"Doce Lar", 300000, imob2);
		Imovel imovel5 = new Imovel(553857, "APARTAMENTO", "DISPONIVEL", "Rua 5",
				"Oasis", 400000, imob1);

	}
}
