package br.com.fiap.gs1.microservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gs1.microservice.controller.dto.gestao.GestaoDronesRequestCreate;
import br.com.fiap.gs1.microservice.controller.dto.gestao.GestaoDronesRequestUpdate;
import br.com.fiap.gs1.microservice.controller.dto.gestao.SearchedGestaoDrones;
import br.com.fiap.gs1.microservice.model.GestaoDrone;
import br.com.fiap.gs1.microservice.repository.GestaoDronesRepository;
import br.com.fiap.gs1.microservice.service.GestaoDronesService;

@RestController
@RequestMapping("/gestaodrones")
public class GestaoDronesController {
	
	@Autowired
	GestaoDronesService gestaoDronesService;
	
	@Autowired
	GestaoDronesRepository gestaoDronesRepository;
	
	@GetMapping
	public ResponseEntity<List<SearchedGestaoDrones>> listall() {
		List<SearchedGestaoDrones> searchedGestao = gestaoDronesService.listAll().stream().map(SearchedGestaoDrones::toDto)
				.collect(Collectors.toList());
		return ResponseEntity.ok(searchedGestao);
	}
	
	@PostMapping
	public ResponseEntity<GestaoDrone> create(@RequestBody GestaoDronesRequestCreate dto){
		GestaoDrone resultado = gestaoDronesService.save(dto.toModel());	
		return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
	}
	
	@PutMapping
	public ResponseEntity<GestaoDrone> update(@RequestBody GestaoDronesRequestUpdate dto){
		boolean existe = gestaoDronesRepository.existsById(dto.getIdGestaoDrones());
		if(!existe) {
			return ResponseEntity.notFound().build();
		}
		GestaoDrone resultado = gestaoDronesService.save(dto.toModel());	
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
	}
	
	@DeleteMapping(value = "{idGestaoDrones}")
	public ResponseEntity<GestaoDrone> delete(@PathVariable Long idGestaoDrones){
		boolean existe = gestaoDronesRepository.existsById(idGestaoDrones);
		if(!existe) {
			return ResponseEntity.notFound().build();
		}
		gestaoDronesRepository.deleteById(idGestaoDrones);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
}
