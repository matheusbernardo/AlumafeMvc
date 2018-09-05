package br.com.cube.AlumafeMvcSystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cube.AlumafeMvcSystem.model.entity.OrcamentoEntity;
import br.com.cube.AlumafeMvcSystem.service.OrcamentoService;

@Controller
@RequestMapping("/orcamento")
public class OrcamentoController {
	
	private OrcamentoService orcamentoService;
	
	@RequestMapping("/criaOrcamentoView")
	public ModelAndView cadastraOrcamentoView(OrcamentoEntity orcamento, List<ObjectError> errors) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("orcamento", orcamento);
		modelAndView.addObject("errors", errors);
		modelAndView.setViewName("/orcamentos/cria-orcamento");
		return modelAndView;
	}
	
	
	@RequestMapping("/criaOrcamentoView")
	public ModelAndView cadastraOrcamentoView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/orcamentos/cria-orcamento");
		return modelAndView;
	}
	
	public  ModelAndView salvaOrcamento(@Valid OrcamentoEntity orcamento, BindingResult result, ModelAndView modelAndView) {	
		
		//Verifica se existem erros no bind do objeto e manda para a tela de cadastro
		if (result.hasErrors()) {
			return cadastraOrcamentoView(orcamento, result.getAllErrors());
		}
		
		OrcamentoEntity entity = orcamentoService.save(orcamento);
		modelAndView.addObject("orcamento", entity);
		modelAndView.setViewName("/orcamentos/cria-orcamento");
		return modelAndView;
	}
	
}
