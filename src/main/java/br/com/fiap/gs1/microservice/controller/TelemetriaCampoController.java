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

import br.com.fiap.gs1.microservice.controller.dto.telemetria.SearchedTelemetriaCampo;
import br.com.fiap.gs1.microservice.controller.dto.telemetria.TelemetriaCampoRequestCreate;
import br.com.fiap.gs1.microservice.controller.dto.telemetria.TelemetriaCampoRequestUpdate;
import br.com.fiap.gs1.microservice.model.TelemetriaCampo;
import br.com.fiap.gs1.microservice.repository.TelemetriaCampoRepository;
import br.com.fiap.gs1.microservice.service.TelemetriaCampoService;

@RestController
@RequestMapping("/telemetriacampo")
public class TelemetriaCampoController {

	@Autowired
	TelemetriaCampoService telemetriaCampoService;
	
	@Autowired
	TelemetriaCampoRepository telemetriaCampoRepository;
	
	@GetMapping
	public ResponseEntity<List<SearchedTelemetriaCampo>> listall() {
		List<SearchedTelemetriaCampo> searchedTelemetria = telemetriaCampoService.listAll().stream().map(SearchedTelemetriaCampo::toDto)
				.collect(Collectors.toList());
		return ResponseEntity.ok(searchedTelemetria);
	}
	
	@PostMapping
	public ResponseEntity<TelemetriaCampo> create(@RequestBody TelemetriaCampoRequestCreate dto){
		TelemetriaCampo resultado = telemetriaCampoService.save(dto.toModel());
		return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
	}
	
	@PutMapping
	public ResponseEntity<TelemetriaCampo> update(@RequestBody TelemetriaCampoRequestUpdate dto){
		boolean existe = telemetriaCampoRepository.existsById(dto.getIdTelemetriaDrones());
		if(!existe) {
			return ResponseEntity.notFound().build();
		}
		TelemetriaCampo resultado = telemetriaCampoService.save(dto.toModel());
		return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
	}
	
	@DeleteMapping(value = "{idTelemetriaDrones}")
	public ResponseEntity<TelemetriaCampo> delete(@PathVariable Long idTelemetriaDrones){
		boolean existe = telemetriaCampoRepository.existsById(idTelemetriaDrones);
		if(!existe) {
			return ResponseEntity.notFound().build();
		}
		telemetriaCampoRepository.deleteById(idTelemetriaDrones);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
}












