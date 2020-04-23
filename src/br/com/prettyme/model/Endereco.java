package br.com.prettyme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "T_PM_ENDERECO")
@Getter
@Setter
public class Endereco {
		
	@Id
	@Column(name = "id_endereco")
	public String cep;
	
	@Column(name = "rua_endereco")
	public String logradouro;
	
	@Column(name = "complemento_endereco")
	public String complemento;
	
	@Column(name = "bairro_endereco")
	public String bairro;
	
	@Column(name = "localidade_endereco")
	public String localidade;
	
	@Column(name = "uf_endereco")
	public String uf;
	
	@Column(name = "is_principal_endereco")
	private boolean principal;

	@ManyToOne
	@Column(name = "alternativo_endereco" )
	private Usuario usuario;
	
	
}
