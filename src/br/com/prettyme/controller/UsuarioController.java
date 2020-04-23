package br.com.prettyme.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.prettyme.dao.ClienteDAO;
import br.com.prettyme.dao.PrestadorDAO;
import br.com.prettyme.exception.RegistroNaoEncontradoException;
import br.com.prettyme.model.Cliente;
import br.com.prettyme.model.Prestador;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	

	@Autowired
	private ClienteDAO clienteDao;
	
	@Autowired
	private PrestadorDAO prestadorDao;
	
	
	@GetMapping("cadastrarCliente")
	public ModelAndView cadastrarCliente(Cliente cliente) {
		return new ModelAndView("usuario/cadastroCliente");
	}
	
	@Transactional
	@PostMapping("cadastrarCliente")
	public ModelAndView cadastrarCliente(@Valid Cliente cliente, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			cadastrarCliente(cliente);
		}
		clienteDao.cadastrar(cliente);
		r.addFlashAttribute("msg", "Cadastrado com sucesso");
		return new ModelAndView("redirect:/index");
	}
	
	@GetMapping("cadastrarPrestador")
	public ModelAndView cadastrarPrestador(Prestador prestador) {
		return new ModelAndView("usuario/cadastroPrestador");
	}
	
	@Transactional
	@PostMapping("cadastrarPrestador")
	public ModelAndView cadastrarPrestador(@Valid Prestador prestador, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			cadastrarPrestador(prestador);
		}
		prestadorDao.cadastrar(prestador);
		r.addFlashAttribute("msg", "Cadastrado com sucesso");
		return new ModelAndView("redirect:/index");
	}

	@GetMapping("listarCliente")
	public ModelAndView listarCliente() {
		return new ModelAndView("usuario/listaCliente")
				.addObject("clientes", clienteDao.listar());
	}
	
	@GetMapping("listarPrestador")
	public ModelAndView listarPrestador() {
		return new ModelAndView("usuario/listaPrestador")
				.addObject("prestadores", prestadorDao.listar());
	}
	
	
	@GetMapping("editarCliente/{id}")
	public ModelAndView editarCliente(@PathVariable("id") int codigo) {
		return new ModelAndView("usuario/edicaoCliente")
				.addObject("cliente", clienteDao.buscar(codigo));
	}
	
	@Transactional
	@PostMapping("editarCliente")
	public ModelAndView editarCliente(@Valid Cliente cliente, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			new ModelAndView("usuario/edicaoCliente")
			.addObject("cliente", cliente);
		}
		clienteDao.atualizar(cliente);
		r.addFlashAttribute("msg", "Atualizado com sucesso");
		return new ModelAndView("redirect:/usuario/listarCliente");
	}
	
	@GetMapping("editarPrestador/{id}")
	public ModelAndView editarPrestador(@PathVariable("id") int codigo) {
		return new ModelAndView("usuario/edicaoPrestador")
				.addObject("prestador", prestadorDao.buscar(codigo));
	}
	
	@Transactional
	@PostMapping("editarPrestador")
	public ModelAndView editarPrestador(@Valid Prestador prestador, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			new ModelAndView("usuario/edicaoPrestador")
			.addObject("usuario", prestador);
		}
		prestadorDao.atualizar(prestador);
		r.addFlashAttribute("msg", "Atualizado com sucesso");
		return new ModelAndView("redirect:/usuario/listarPrestador");
	}
	
	@Transactional
	@PostMapping("removerCliente")
	public String removerCliente(int codigo, RedirectAttributes r) {
		try {
			clienteDao.excluir(codigo);
			r.addFlashAttribute("msg","Removido com sucesso!");
		} catch (RegistroNaoEncontradoException e) {
			e.printStackTrace();
		}
		return "redirect:/usuario/listarCliente";
	}
	
	@Transactional
	@PostMapping("removerPrestador")
	public String remover(int codigo, RedirectAttributes r) {
		try {
			prestadorDao.excluir(codigo);
			r.addFlashAttribute("msg","Removido com sucesso!");
		} catch (RegistroNaoEncontradoException e) {
			e.printStackTrace();
		}
		return "redirect:/usuario/listarPrestador";
	}

}
