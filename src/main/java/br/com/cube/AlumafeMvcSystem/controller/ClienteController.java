package br.com.cube.AlumafeMvcSystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cube.AlumafeMvcSystem.model.entity.ClienteEntity;
import br.com.cube.AlumafeMvcSystem.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	// Método para carregar a página
	@RequestMapping("/cadastraClienteView")
	private ModelAndView novo(ModelAndView mav) {
		mav.addObject("cliente", new ClienteEntity());
		mav.setViewName("/clientes/formulario-cliente");
		return mav;
		
	}
	
	// Método para carregar a página de cadastro com os erros
	private ModelAndView novo(ClienteEntity cliente, List<ObjectError> listOfObjectErrors) {
		List<String> errors = new ArrayList<>();
		listOfObjectErrors.forEach(x -> {
			errors.add(x.getDefaultMessage());
		});
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("cliente", cliente);
		mav.addObject("errors", errors);
		mav.setViewName("/clientes/formulario-cliente");			
		return mav;
		
	}
	
	// Método para inserir cliente 
	@RequestMapping(value="/cadastraCliente")
	private ModelAndView insert(@Valid ClienteEntity cliente, BindingResult result, ModelAndView mav) {
		
		if (result.hasErrors()) {
			return novo(cliente, result.getAllErrors());
		}
		
		ClienteEntity criaCliente = this.clienteService.save(cliente);
		mav.addObject("messageSuccess", "sucesso");
		mav.addObject("cliente",criaCliente);
		mav.setViewName("/clientes/formulario-cliente");
		return mav;
		
	}
	
	@RequestMapping(value="/listaCliente")
	private String listaCliente(Model model) {
		model.addAttribute("clientes", this.clienteService.findAll());
		return "/clientes/lista-cliente";
		
	}
}
