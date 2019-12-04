package model.entities;

import model.enums.State;
import model.enums.TipoImovel;
import model.exceptions.InvalidImovelTypeException;

public class Imovel {
	private int matricula;
	private TipoImovel tipoImovel;
	private State estado;
	private String endereco;
	private String nome;
	private float preco;
	private Imobiliaria imobiliaria;
	
	public Imovel() {
		
	}
	
	public Imovel(int matricula, String tipoImovel, String estado, String endereco, 
			String nome, float preco, Imobiliaria imobiliaria) {
		this.matricula = matricula;
		this.tipoImovel = TipoImovel.valueOf(tipoImovel);
		this.estado = State.valueOf(estado);
		this.endereco = endereco;
		this.nome = nome;
		this.preco = preco;
		this.imobiliaria = imobiliaria;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public TipoImovel getTipo() {
		return tipoImovel;
	}

	public void setTipo(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado( String estado) {
		this.estado = State.valueOf(estado);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCnpjImobiliaria() {
		return this.imobiliaria.getCnpj();
	}

	
	public String toString() {
		return "Nome do imóvel: " + this.nome + ", matrícula: " + this.matricula + "\n" +
				"Endereço: " + this.endereco + "\n" + "Preço: " + this.preco + ", Status: " +
				this.estado + "\n";
	}
	
}