package br.com.prettyme.model;

import java.util.Date;
import java.util.List;

public class Agendamento {
	private Date data; // Importei o tipo Date do java.util pra esse atributo, porém não sei se é o mais correto
	private Cliente cliente;
	private Prestador prestador;
	private List<Servico> servicos;
	private String descricao;
	private String observacoes;
	private float rate;
	
	public Agendamento() {
		super();
	}

	public Agendamento(Date data, Cliente cliente, Prestador prestador, List<Servico> servicos, String descricao, String observacoes,
			float rate) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.prestador = prestador;
		this.servicos = servicos;
		this.descricao = descricao;
		this.observacoes = observacoes;
		this.rate = rate;
	}
	
	
}
