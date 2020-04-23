package br.com.prettyme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "T_PM_TELEFONE")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Telefone {


	@Id
	private int idTelefone;
	
	@Column
	private int ddd;
	
	@Column
	private int ddi;
	
	@Column
	private int numero;

	@Column
	private boolean isCelular;
	
	@ManyToOne
	private Usuario usuario;
	
	
	
}
