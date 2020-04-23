package br.com.prettyme.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//define o nome do tipo de usuario 
@DiscriminatorValue("cliente")
public class Cliente extends Usuario{
	
	@Id
	private int idCliente;
	
	@Column
	private float rate;
	
	@Column
	private Sexo sexo;
	
	@Column
	private List<String> agendamentos;
	
	
	public Cliente() {
		super();
	}

	public Cliente(int idCliente, float rate, Sexo sexo, List<String> agendamentos) {
		super();
		this.idCliente = idCliente;
		this.rate = rate;
		this.sexo = sexo;
		this.agendamentos = agendamentos;
	}
	
	

}
