package br.com.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		
		System.out.println("Home Casa do Codigo");
		
		return "/home";
		
		
	}

}
