package br.com.prettyme.model;

import java.util.List;

public class Estabelecimento {
	private String nome;
	private String cnpj;
	private String cep;
	private Prestador dono;
	private List<Prestador> funcionarios;
	private byte logo; // Não sei se ta certo assim o tipo byte, da uma olhada e me fala
	private byte banner;
	//private Estoque estoque; *** Classe Estoque ainda a ser criada ***
	private int vagas;
	
	public Estabelecimento() {
		super();
	}

	public Estabelecimento(String nome, String cnpj, String cep, Prestador dono, List<Prestador> funcionarios,
			byte logo, byte banner, /*Estoque estoque,*/ int vagas) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.cep = cep;
		this.dono = dono;
		this.funcionarios = funcionarios;
		this.logo = logo;
		this.banner = banner;
		/*this.estoque = estoque;*/
		this.vagas = vagas;
	}
	
}
