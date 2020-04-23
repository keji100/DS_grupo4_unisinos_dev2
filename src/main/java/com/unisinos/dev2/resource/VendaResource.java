package com.unisinos.dev2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unisinos.dev2.service.VendaService;
import com.unisinos.dev2.vo.Venda;

@RestController
@RequestMapping(value="/venda")
public class VendaResource {

	@Autowired
	private VendaService vendaService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Venda> find(@PathVariable Integer id){
		Venda obj = vendaService.buscarVendaID(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
