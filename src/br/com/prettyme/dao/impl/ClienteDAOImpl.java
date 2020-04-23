package br.com.prettyme.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.prettyme.dao.ClienteDAO;
import br.com.prettyme.model.Cliente;

@Repository
public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

}
