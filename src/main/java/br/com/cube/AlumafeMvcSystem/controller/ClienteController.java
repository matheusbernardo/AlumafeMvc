package br.com.cube.AlumafeMvcSystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cube.AlumafeMvcSystem.model.entity.ClienteEntity;
import br.com.cube.AlumafeMvcSystem.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	

	@RequestMapping("/cadastraClienteView")
	private ModelAndView cadastraClienteView(ClienteEntity cliente) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("cliente", cliente);
		modelAndView.setViewName("/clientes/cadastra-cliente");
		return modelAndView;
	}
	
	private ModelAndView cadastraClienteView(ClienteEntity cliente, List<ObjectError> errors ) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("cliente", cliente);
		modelAndView.addObject("errors", errors);
		modelAndView.setViewName("/clientes/cadastra-cliente");
		return modelAndView;
	}
	
	@RequestMapping(value="/cadastraCliente")
	private ModelAndView saveCliente(@Valid ClienteEntity cliente, BindingResult result, ModelAndView modelAndView) {		
		//Verifica se existem erros no bind do objeto e manda para a tela de cadastro
		if (result.hasErrors()) {
			cadastraClienteView(cliente, result.getAllErrors());
		}	
		//Salva o cliente no banco e retorna para a tela de listagem de clientes
		ClienteEntity criaCliente = this.clienteService.save(cliente);
		modelAndView.addObject("cliente",criaCliente);
		modelAndView.setViewName("/clientes/cadastra-cliente");
		return modelAndView;
	}
	
	@RequestMapping(value="/listaCliente")
	private ModelAndView listaCliente(ModelAndView modelAndView) {
		modelAndView.addObject("clientes", this.clienteService.findAll());
		return modelAndView;
		
	}
	
	@RequestMapping(value="/deleta/cliente/{clienteId}")
	private ModelAndView deletaCliente(@PathVariable Long id, ModelAndView modelAndView) {
		this.clienteService.delete(id);
		modelAndView.setViewName("orcamentos/deleteSuccess");
		return modelAndView;
	}
}
