package br.com.fiap.gs1.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.gs1.microservice.model.TelemetriaCampo;
import br.com.fiap.gs1.microservice.repository.TelemetriaCampoRepository;

@Service
public class TelemetriaCampoService {

	@Autowired
	private TelemetriaCampoRepository tcr;
	
	public List<TelemetriaCampo> listAll() {
		return tcr.findAll();
	}
	
	public TelemetriaCampo save(TelemetriaCampo telemetricaCampo) {
		return tcr.save(telemetricaCampo);
	}
}
