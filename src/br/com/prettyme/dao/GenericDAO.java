package br.com.prettyme.dao;

import java.util.List;

import br.com.prettyme.exception.RegistroNaoEncontradoException;

public interface GenericDAO <Tabela,Chave>{

	//insert into table valeu
	void cadastrar(Tabela tabela);
	
	//update table set....
	void atualizar(Tabela tabela);
		
	//delete from table where
	void excluir(Chave codigo) throws RegistroNaoEncontradoException;
	
	//select * from table where
	Tabela buscar(Chave codigo);
	
	//select * from table
	List<Tabela> listar();
}
