package model.view;

import javax.swing.JOptionPane;
import model.controllers.*;
import model.entities.*;
import model.exceptions.CpfInvalidoException;
//import model.exceptions.*;
import model.exceptions.ValorInvalidoException;

public class ApplicationConsole {
	
	//Função Main
	public static void main (String[] args) throws ValorInvalidoException, CpfInvalidoException {
		ImovelList imovelList = new ImovelList();
		 boolean lever = true;
		 String[] opcoes = {"Cadastrar Cliente", "Cadastrar Corretor","Firmar Contrato",
				"Exibir Contrato", "Exibir Imóvel","Lista de clientes"};
		 Object resposta;
		
		while (lever) {
			resposta = JOptionPane.showInputDialog(null, "O que deseja fazer?",
					"Seleção",JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
			if (resposta == null) {
				JOptionPane.showMessageDialog(null, "Fim da Aplicação");
				break;
			} else if (resposta == "Cadastrar Cliente") {
				cadastraCliente();
				continue;
			} else if (resposta == "Cadastrar Corretor") {
				cadastraCorretor();
				continue;
			} else if (resposta == "Firmar Contrato") {
				firmaContrato();
				continue;
			}else if (resposta == "Lista de clientes cadastrados") {
				System.out.println(clienteList); // Tenta colocar isso com um array em joptionpane que eu nao consegui fazer...
			}
			
		}
			
		} 
	
	
	public static void cadastraCliente() throws ValorInvalidoException, CpfInvalidoException {
			long cpfCliente;
			int telefoneCliente = 0;
			String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente?");
			try {
				cpfCliente = Long.parseLong(JOptionPane.showInputDialog("Qual o CPF do Cliente? "
						+ "(Apenas números)"));
				if(cpfCliente > 10000000000L || cpfCliente < 999999999999L) { // CONSERTA AQUI
					throw new CpfInvalidoException("Número de cpf muito curto!");
				}
				} catch (CpfInvalidoException e) {
					JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
				}
				try {
					telefoneCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual o telefone do Cliente? "
						+ "(Apenas números)"));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
			}
		    Cliente cliente = new Cliente(nomeCliente, telefoneCliente, cpfCliente);
		    clienteList.addCliente(cliente);
		    JOptionPane.showMessageDialog(null, "Cliente  cadastrado com sucesso!");
	}
	
	public static void cadastraCorretor() {
		int cpfCorretor, creciCorretor, telefoneCorretor;
		
		String nomeCorretor = JOptionPane.showInputDialog("Qual o nome do Corretor?");
		try {
			cpfCorretor = Integer.parseInt(JOptionPane.showInputDialog("Qual o CPF do Corretor? "
					+ "(Apenas números)"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
		try {
			creciCorretor = Integer.parseInt(JOptionPane.showInputDialog("Qual o Creci do Corretor? "
					+ "(Apenas números)"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
		try {
			telefoneCorretor = Integer.parseInt(JOptionPane.showInputDialog("Qual o telefone do Corretor? "
					+ "(Apenas números)"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
		
	// Pessoa corretor = new Corretor(creciCorretor, telefoneCorretor, Imobiliaria, cpfCorretor);
		
		
	}
	
	public static void firmaContrato() {
		if(corretorList.estaVazia() || clienteList.estaVazia()) {
			JOptionPane.showMessageDialog(null, "Não existe nenhum corretor ou cliente cadastrado!");
		} else {
			
		}
	}
	
	public static void exibirContrato() {
		
	}
	
	public static void exibirImovel() {
		
	}
	
	//Métodos estáticos para criar as listas de objetos
		static ImovelList imovelList = new ImovelList();
		static CorretorList corretorList = new CorretorList();
		static ContratoList contratoList = new ContratoList();
		static ClienteList clienteList = new ClienteList();
		
		//Criando instancias de imobiliaria
		static Imobiliaria imob1 = new Imobiliaria("12345678901113", "Rua saudades dela", "Lego");
		static Imobiliaria imob2 = new Imobiliaria("21345678901113", "Rua foda que ela é linda",
				"Playmobil");
		
		//Criando instancias de imóvel
		static Imovel imovel1 = new Imovel(122134, "CASA","DISPONIVEL", "Rua 3",
				"Castelo do Drácula", 300000,imob1);
		static Imovel imovel2 = new Imovel(451241, "APARTAMENTO", "DISPONIVEL", "Rua 2",
				"Castelo Ratimbum", 40000,imob2);
		static Imovel imovel3 = new Imovel(482951, "COMERCIO", "DISPONIVEL", "Rua 3",
				"Casa dos Instrumentos", 140000, imob1);
		static Imovel imovel4 = new Imovel(649275, "CASA", "DISPONIVEL", "Rua 4", 
				"Doce Lar", 300000, imob2);
		static Imovel imovel5 = new Imovel(553857, "APARTAMENTO", "DISPONIVEL", "Rua 5",
				"Oasis", 400000, imob1);
	
	
	
	
	
}
