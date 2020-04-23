package com.unisinos.dev2;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

import com.unisinos.dev2.repository.VendaRepository;
import com.unisinos.dev2.vo.Venda;

@SpringBootApplication
public class Grupo4dev2Application extends SpringServletContainerInitializer implements CommandLineRunner{

	@Autowired
	private VendaRepository vendaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Grupo4dev2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Venda venda1 = new Venda(null, "Luiz", "Jose", 200);
		Venda venda2 = new Venda(null, "Luiz", "Mario", 200.50);
		Venda venda3 = new Venda(null, "Luiz", "Luisa", 10);
		
		vendaRepository.saveAll(Arrays.asList(venda1, venda2, venda3));
		
	}
}
