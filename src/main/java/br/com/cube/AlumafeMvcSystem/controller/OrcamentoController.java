package br.com.cube.AlumafeMvcSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orcamento")
public class OrcamentoController {
	
	@RequestMapping("/criaOrcamentoView")
	public String criaOrcamento() {
		return "orcamentos/cria-orcamento";
	}
	
}
