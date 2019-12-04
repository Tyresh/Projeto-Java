package model.view;

import javax.swing.JOptionPane;
import model.controllers.*;
import model.entities.*;
import model.enums.TipoContrato;
import model.exceptions.*;

public class ApplicationConsole {
	
	//Função Main
	public static void main (String[] args) throws ValorInvalidoException, CpfInvalidoException, 
	TelefoneInvalidoException, CreciInvalidoException, CampoInvalidoException {
		
		ImovelList imovelList = new ImovelList();
		 boolean lever = true;
		 String[] opcoes = {"Cadastrar Cliente", "Cadastrar Corretor","Firmar Contrato",
				"Lista de Contratos cadastrados", "Lista de Imóveis cadastrados","Lista de Clientes cadastrados", 
				"Lista de Corretores cadastrados"};
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
			} else if (resposta == "Lista de Clientes cadastrados") {
				exibirClientes();
			} else if (resposta == "Lista de Corretores cadastrados") {
				exibirCorretores();
			} else if (resposta == "Lista de Contratos cadastrados") {
				exibirContratos();
			} else if (resposta == "Lista de Imóveis cadastrados") {
				exibirImoveis();
			}
			
		}
			
		} 
	
	
	public static void cadastraCliente() throws TelefoneInvalidoException, CpfInvalidoException,
	ValorInvalidoException {
			long cpfCliente = 0, telefoneCliente = 0;
			
			String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente?");
			
			try {
				cpfCliente = Long.parseLong(JOptionPane.showInputDialog("Qual o CPF do Cliente? "
						+ "(Apenas números)"));
				if(cpfCliente > 99999999999L ) {
					throw new CpfInvalidoException("Número de CPF muito longo!");
				} 
				if(cpfCliente < 1000000000L) {
					throw new CpfInvalidoException("Número de CPF muito curto!");
				}
				telefoneCliente = Long.parseLong(JOptionPane.showInputDialog("Qual o telefone do Cliente? "
						+ "(Apenas números, DDD incluído)"));
				if(telefoneCliente > 99999999999L) {
					throw new TelefoneInvalidoException("Número de telefone muito longo!");
				}
				if(telefoneCliente < 10000000000L) {
					throw new TelefoneInvalidoException("Número de telefone muito curto!");
				}
				
				Cliente cliente = new Cliente(cpfCliente, telefoneCliente, nomeCliente);
				clienteList.addCliente(cliente);
				JOptionPane.showMessageDialog(null, "Cliente  cadastrado com sucesso!");

			} catch (CpfInvalidoException e) {
				JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
			} catch (TelefoneInvalidoException e) {
				JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
			}
			
		  
	}
	
	public static void cadastraCorretor() throws TelefoneInvalidoException, CpfInvalidoException,
	ValorInvalidoException, CreciInvalidoException{
		long cpfCorretor, telefoneCorretor;
		int creciCorretor;
		
		String nomeCorretor = JOptionPane.showInputDialog("Qual o nome do Corretor?");
		try {
			cpfCorretor = Long.parseLong(JOptionPane.showInputDialog("Qual o CPF do Corretor? "
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
			telefoneCorretor = Long.parseLong(JOptionPane.showInputDialog("Qual o telefone do Corretor? "
					+ "(Apenas números)"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
		
	// Pessoa corretor = new Corretor(creciCorretor, telefoneCorretor, Imobiliaria, cpfCorretor);
		
		
	}
	
	public static void firmaContrato() {
		boolean fiador;
		Enum tipoContrato;
		int numero;
		try {
			if(corretorList.estaVazia() || clienteList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum corretor, cliente ou imóvel cadastrado!");
			}
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do contrato:"));
			
			
			tipoContrato =  TipoContrato.valueOf(JOptionPane.showInputDialog("Digite o tipo do Contrato (VENDA OU ALUGUEL):"));
			if(tipoContrato == null) {
				throw new CampoInvalidoException("Campo não selecionado");
			}
			
			int resposta = JOptionPane.showConfirmDialog(null, "O contrato possui fiador?");
			
			if (resposta == 0) {
				fiador = true;
			} else if (resposta == 1) {
				fiador = false;
			} else {
				throw new CampoInvalidoException("Fiador não selecionado!");
			}
			
			Object corretor = JOptionPane.showInputDialog(null, "Selecione seu Corretor","Lista de Corretores",
					JOptionPane.PLAIN_MESSAGE,null, corretorList.transformaEmArrayDeNomes(), null);
			if(corretor == null) {
				throw new CampoInvalidoException("Campo não selecionado");
			}
			
			Object cliente =  JOptionPane.showInputDialog(null, "Selecione seu Cliente","Lista de Clientes",
					JOptionPane.PLAIN_MESSAGE,null, clienteList.transformaEmArrayDeNomes(), null);
			if(cliente == null) {
				throw new CampoInvalidoException("Campo não selecionado");
			}
			
			Object imovel =  JOptionPane.showInputDialog(null, "Selecione seu Imovel","Lista de Imóveis",
					JOptionPane.PLAIN_MESSAGE,null, imovelList.transformaEmArrayDeNomes(), null);
			if(imovel == null) {
				throw new CampoInvalidoException("Campo não selecionado");
			}
			
			Contrato contato = new Contrato(numero, tipoContrato, fiador, corretorList.findCorretor(corretor);
			
			
			
		}
		catch (CampoInvalidoException e ) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
	}

	
	public static void exibirContratos() {
		try {
			if(contratoList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum contrato firmado!");
			}
		    /* Object contrato = JOptionPane.showInputDialog(null, "Selecione seu Contrato","Lista de Contratos",
			JOptionPane.PLAIN_MESSAGE,null, contratoList.transformaEmArray(), null);
			if (contrato == null) {
				JOptionPane.showMessageDialog(null, "Contrato não selecionado");
			} else {
				JOptionPane.showMessageDialog(null, contratoList.toStringOfObject(contrato));
			} */
		} catch(CampoInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
	}
	
	public static void exibirImoveis() throws CampoInvalidoException {
		try {
			if(imovelList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum imóvel cadastrado!");
			}
			/* Object imovel = JOptionPane.showInputDialog(null, "Selecione seu Imóvel","Lista de Imóveis",
			JOptionPane.PLAIN_MESSAGE,null, imovelList.transformaEmArrayDeNomes(), null);
			if (imovel == null) {
				JOptionPane.showMessageDialog(null, "Imóvel não selecionado");
			} else {
				JOptionPane.showMessageDialog(null, imovelList.toStringOfObject(imovel));
			} */
		} catch(CampoInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
	}
	
	
	public static void exibirClientes() throws CampoInvalidoException {
		try {
			if(clienteList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum cliente cadastrado!");
			}
			
			Object cliente = JOptionPane.showInputDialog(null, "Selecione seu Cliente","Lista de Clientes",
			JOptionPane.PLAIN_MESSAGE,null, clienteList.transformaEmArrayDeNomes(), null);
			
			if (cliente == null) {
				JOptionPane.showMessageDialog(null, "Cliente não selecionado");
			} else {
				JOptionPane.showMessageDialog(null, clienteList.toStringOfObject(cliente));
			}
		} catch(CampoInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido!",0);
		}
	}
	
	public static void exibirCorretores() throws CampoInvalidoException {
		try {
			if(corretorList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum corretor cadastrado!");
			}
			/* Object corretor = JOptionPane.showInputDialog(null, "Selecione seu Corretor","Lista de Corretores",
			JOptionPane.PLAIN_MESSAGE,null, corretorList.transformaEmArray(), null);
			if (corretor == null) {
				JOptionPane.showMessageDialog(null, "Corretor não selecionado");
			} else {
				// JOptionPane.showMessageDialog(null, corretorList.toStringOfObject(corretor));
			} */
		} catch(CampoInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
	}
	
	//Métodos estáticos para criar as listas de objetos
		static ImovelList imovelList = new ImovelList();
		static CorretorList corretorList = new CorretorList();
		static ContratoList contratoList = new ContratoList();
		static ClienteList clienteList = new ClienteList();
		static String[] tipoContratoArray = {"VENDA", "ALUGUEL"};
		
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
