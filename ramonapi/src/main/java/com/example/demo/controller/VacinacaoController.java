package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vacinacao;
import com.example.demo.repository.VacinacaoRepository;

@RestController
@RequestMapping("/vacinacoes")
public class VacinacaoController {

	@Autowired
	private VacinacaoRepository vacinacaoRepository;
	
	@GetMapping
	public List<Vacinacao> listar() {
		return vacinacaoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vacinacao adicionar(@RequestBody Vacinacao vacincacao) {
		return vacinacaoRepository.save(vacincacao);
	}
}
