package br.com.cube.AlumafeMvcSystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cube.AlumafeMvcSystem.model.dto.ClienteDTO;
import br.com.cube.AlumafeMvcSystem.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@RequestMapping("/cadastraClienteView")
	private String cadastraClienteView(Model model) {
		model.addAttribute("cliente", new ClienteDTO());
		return "/clientes/cadastra-cliente";
		
	}
	
	@RequestMapping(value="/cadastraCliente")
	private String cadastraCliente(@Valid ClienteDTO cliente, Model model) {
		ClienteDTO criaCliente = this.clienteService.criaCliente(cliente);
		model.addAttribute("cliente",criaCliente);
		return "/clientes/cadastra-cliente";
		
	}
	
	@RequestMapping(value="/listaCliente")
	private String listaCliente(Model model) {
		model.addAttribute("clientes", this.clienteService.listaClientes());
		return "/clientes/lista-cliente";
		
	}
}
