package model.entities;

import java.util.Date;

public class Historico {
	
	private int protocolo;
	private Date dataHistorico;
	private String descricao;
	private Corretor corretor;
	private Imovel imovel;
	
	public Historico(int protocolo, Date dataHistorico, String descricao, Corretor corretor, Imovel imovel) {
		this.protocolo = protocolo;
		this.dataHistorico = dataHistorico;
		this.descricao = descricao;
		this.corretor = corretor;
		this.imovel = imovel;
	}
	
	public int getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}
	public Date getDataHistorico() {
		return dataHistorico;
	}
	public void setDataHistorico(Date dataHistorico) {
		this.dataHistorico = dataHistorico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCreciCorretor() {
		return this.corretor.getCreci();
	}
	public int getMatImovel() {
		return this.imovel.getMatricula();
	}

}