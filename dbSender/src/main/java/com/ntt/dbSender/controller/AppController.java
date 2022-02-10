package com.ntt.dbSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.dbSender.IMongo.IMongo;
import com.ntt.dbSender.model.Mensaje;

import reactor.core.publisher.Mono;

@RestController("")
public class AppController {
	
	@Autowired
	IMongo repo;
	
	@GetMapping("/add/{texto}")
	public Mono<Mensaje> crear(@PathVariable String texto) {
		
		
		
		return repo.save(Mensaje.builder().msg(texto).build());
	}
	
	@GetMapping("/")
	public String va() {
		return "va";
	}

}
