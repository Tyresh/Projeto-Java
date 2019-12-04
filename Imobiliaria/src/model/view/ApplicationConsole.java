package model.view;

import model.controllers.*;
import model.entities.*;
import model.enums.*;

public class ApplicationConsole {
	public static void main (String[] args) {

		Cliente leo = new Cliente();
		System.out.println(leo);
		Contrato cont = new Contrato();
		System.out.println("---------------------------");
		System.out.println(cont);

		
	}
}
