package com.unisinos.dev2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unisinos.dev2.repository.VendaRepository;
import com.unisinos.dev2.vo.Venda;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository repo;
	
	public Venda buscarVendaID(Integer id) {
		Optional<Venda> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
