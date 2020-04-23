package br.com.prettyme.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.prettyme.dao.UsuarioDAO;
import br.com.prettyme.model.Usuario;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario,Integer> implements UsuarioDAO{

}
