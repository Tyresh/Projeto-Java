package model.view;

import javax.swing.JOptionPane;

import model.controllers.*;
import model.entities.*;
import model.enums.*;
import model.exceptions.*;

public class ApplicationConsole {
	//Função Main
	public static void main (String[] args) throws ValorInvalidoException, CpfInvalidoException, 
	TelefoneInvalidoException, CreciInvalidoException, CampoInvalidoException, CnpjInvalidoException {
		
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
			} else if (resposta == "Cadastrar Corretor") {
				cadastraCorretor();
			} else if (resposta == "Cadastrar Imobiliária") {
				cadastraImobiliaria();
			} else if (resposta == "Cadastrar Imóvel") {
				cadastraImovel();
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
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

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
			if(cpfCorretor > 99999999999L ) {
				throw new CpfInvalidoException("Número de CPF muito longo!");
			} 
			if(cpfCorretor < 1000000000L) {
				throw new CpfInvalidoException("Número de CPF muito curto!");
			}
			telefoneCorretor = Long.parseLong(JOptionPane.showInputDialog("Qual o telefone do Corretor? "
					+ "(Apenas números, DDD incluído)"));
			if(telefoneCorretor > 99999999999L) {
				throw new TelefoneInvalidoException("Número de telefone muito longo!");
			}
			if(telefoneCorretor < 10000000000L) {
				throw new TelefoneInvalidoException("Número de telefone muito curto!");
				
			}creciCorretor = Integer.parseInt(JOptionPane.showInputDialog("Qual o Creci do Corretor? "
					+ "(Apenas números)"));
			if(creciCorretor> 99999 ) {
				throw new CreciInvalidoException("Somente 5 digitos!");
			}if(creciCorretor< 10000 ) {
				throw new CreciInvalidoException("Somente 5 digitos!");
			}
			
			Corretor corretor = new Corretor(creciCorretor, telefoneCorretor, nomeCorretor,cpfCorretor);
			
			corretorList.addCorretor(corretor);
			
			JOptionPane.showMessageDialog(null, "Corretor cadastrado com sucesso!");

		} catch (CpfInvalidoException e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		} catch (TelefoneInvalidoException e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
		
	}
	
	public static void cadastraImobiliaria() throws CnpjInvalidoException {
		long cnpjImobiliaria = 0L;
		String nomeImobiliaria = JOptionPane.showInputDialog("Qual o nome da Imobiliaria?");
		try {
			cnpjImobiliaria = Long.parseLong(JOptionPane.showInputDialog("Qual o CNPJ da Imobiliaria?"
					+ "(Apenas números)"));
			if(cnpjImobiliaria > 99999999999999L ) {
				throw new CnpjInvalidoException("CNPJ muito longo!");
			} 
			if(cnpjImobiliaria < 1000000000000L) {
				throw new CnpjInvalidoException("CNPJ muito curto!");
			}
		} catch (CnpjInvalidoException e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
	   String endereco = JOptionPane.showInputDialog("Qual o endereço da Imobiliaria?");
	   
	   Imobiliaria imobiliaria = new Imobiliaria(cnpjImobiliaria, endereco, nomeImobiliaria);
	   imobiliariaList.addImobiliaria(imobiliaria);
	   JOptionPane.showMessageDialog(null, "Imobiliária cadastrada com sucesso!");
	}
	
	public static void cadastraImovel() {
		int numeroMatricula;
		try {
			if(imobiliariaList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhuma imobiliária cadastrada!");
			}
			
			numeroMatricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do imóvel: "));
			TipoImovel tipoImovel = TipoImovel.valueOf(JOptionPane.showInputDialog("Digite o tipo do Imóvel"
					+ "(CASA, APARTAMENTO, COMÉRCIO): "));
			String nomeImovel = JOptionPane.showInputDialog("Qual o nome do Imóvel?");
			String endereco = JOptionPane.showInputDialog("Qual o endereço do Imóvel?");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do Imóvel?"));
			Object imobiliaria =  JOptionPane.showInputDialog(null, "Selecione sua Imobiliária",
					"Lista de Imobiliárias",JOptionPane.PLAIN_MESSAGE,null, 
					imobiliariaList.transformaEmArrayDeNomes(), null);
			if(imobiliaria == null) {
				throw new CampoInvalidoException("Campo não selecionado");
			}
			Imovel imovel = new Imovel(numeroMatricula, tipoImovel, State.DISPONIVEL, endereco, nomeImovel, preco,
					imobiliariaList.findImobiliaria(imobiliaria));
			JOptionPane.showMessageDialog(null, "Contrato firmado com sucesso!");
		} catch (CampoInvalidoException e ) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
	}
	
	public static void firmaContrato() {
		boolean fiador;
		int numero;
		try {
			if(corretorList.estaVazia() || clienteList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum corretor, cliente ou imóvel cadastrado!");
			}
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do contrato:"));
			
			
			TipoContrato tipoContrato = TipoContrato.valueOf(JOptionPane.showInputDialog("Digite o tipo do Contrato (VENDA OU ALUGUEL):"));
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
			
			Contrato contrato = new Contrato(numero, tipoContrato, fiador, corretorList.findCorretor(corretor),
					clienteList.findCliente(cliente), imovelList.findImovel(imovel));
			contratoList.addContrato(contrato);
			JOptionPane.showMessageDialog(null, "Contrato firmado com sucesso!");
		}
		catch (CampoInvalidoException e ) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido", e.getMessage(), 0);
		}
	}

	
	public static void exibirContratos() {
		Contrato contrato;
		try {
			if(contratoList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum contrato firmado!");
			}
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do contrato:"));
			contrato = contratoList.findContratoByNumero(numero);
				JOptionPane.showMessageDialog(null, contrato.toString());
		} catch(CampoInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		} catch (ValorNaoExisteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Valor não existe!", 0);
		}
	}
	
	public static void exibirImoveis() throws CampoInvalidoException {
		try {
			if(imovelList.estaVazia()) {
				throw new CampoInvalidoException("Não existe nenhum imóvel cadastrado!");
			}
			 Object imovel = JOptionPane.showInputDialog(null, "Selecione seu Imóvel","Lista de Imóveis",
			JOptionPane.PLAIN_MESSAGE,null, imovelList.transformaEmArrayDeNomes(), null);
			if (imovel == null) {
				JOptionPane.showMessageDialog(null, "Imóvel não selecionado");
			} else {
				JOptionPane.showMessageDialog(null, imovelList.toStringOfObject(imovel));
			} 
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
			 Object corretor = JOptionPane.showInputDialog(null, "Selecione seu Corretor","Lista de Corretores",
			JOptionPane.PLAIN_MESSAGE,null, corretorList.transformaEmArrayDeNomes(), null);
			if (corretor == null) {
				JOptionPane.showMessageDialog(null, "Corretor não selecionado");
			} else {
				 JOptionPane.showMessageDialog(null, corretorList.toStringOfObject(corretor));
			} 
		} catch(CampoInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Campo Inválido",0);
		}
	}
	
	//Métodos estáticos para criar as listas de objetos
		static ImovelList imovelList = new ImovelList();
		static ImobiliariaList imobiliariaList = new ImobiliariaList();
		static CorretorList corretorList = new CorretorList();
		static ContratoList contratoList = new ContratoList();
		static ClienteList clienteList = new ClienteList();
		static String[] tipoContratoArray = {"VENDA", "ALUGUEL"};
		
		//Criando instancias de imobiliaria

		
		//Criando instancias de imóvel
		
	
	
	
}
