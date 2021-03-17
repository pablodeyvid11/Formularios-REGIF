package com.pablodeyvid.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pablodeyvid.demo.dto.RespostaDTO;
import com.pablodeyvid.demo.entities.Resposta;
import com.pablodeyvid.demo.repositories.RespostaRepository;

@Service
public class RespostaService {
	@Autowired
	private RespostaRepository respostaRepository;
	
	
	@Transactional(readOnly = true)
	public List<RespostaDTO> findAll() {
		List<Resposta> lista = respostaRepository.findAll();
		return lista.stream().map(x -> new RespostaDTO(x)).collect(Collectors.toList());
	}
}
