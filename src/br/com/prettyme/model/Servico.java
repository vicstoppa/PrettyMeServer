package br.com.prettyme.model;

import java.util.Date;

public class Servico {
	private String nome;
	//private Categoria categoria; *** Classe Categoria a ser criada ***
	private Date duracao; // Importei o tipo Date do java.util pra esse atributo, porém não sei se é o mais correto
	private float preco;
	
	public Servico() {
		super();
	}

	public Servico(String nome, /*Categoria categoria,*/ Date duracao, float preco) {
		super();
		this.nome = nome;
		/*this.categoria = categoria;*/
		this.duracao = duracao;
		this.preco = preco;
	}
	
	
}
