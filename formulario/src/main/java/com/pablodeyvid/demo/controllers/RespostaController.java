package com.pablodeyvid.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablodeyvid.demo.dto.RespostaDTO;
import com.pablodeyvid.demo.services.RespostaService;

@RestController
@RequestMapping(value = "/respostas")
public class RespostaController {

	@Autowired
	private RespostaService respostaService;
	
	@GetMapping
	public ResponseEntity<List<RespostaDTO>> findAll() {
		List<RespostaDTO> lista = respostaService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/{campus}")
	public ResponseEntity<List<RespostaDTO>> findByCampus(@PathVariable String campus){
		List<RespostaDTO> lista = respostaService.findByCampus(campus);
		return ResponseEntity.ok().body(lista);
	}
}
