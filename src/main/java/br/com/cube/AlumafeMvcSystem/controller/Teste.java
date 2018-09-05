package br.com.cube.AlumafeMvcSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Teste {
	
	@GetMapping("/")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("nome", "Matheus Bernardo");
		mv.setViewName("layout");
		return mv;
	}
}
