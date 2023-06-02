package br.com.fiap.gs1.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.gs1.microservice.model.GestaoDrone;
import br.com.fiap.gs1.microservice.repository.GestaoDronesRepository;

@Service
public class GestaoDronesService {
	
	@Autowired
	private GestaoDronesRepository gdr;
	
	public List<GestaoDrone> listAll() {
		return gdr.findAll();
	}
	
	public GestaoDrone save(GestaoDrone gestaoDrones) {
		return gdr.save(gestaoDrones);
	}
}
