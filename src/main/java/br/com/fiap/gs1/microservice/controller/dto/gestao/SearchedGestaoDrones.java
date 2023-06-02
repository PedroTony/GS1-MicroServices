package br.com.fiap.gs1.microservice.controller.dto.gestao;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.fiap.gs1.microservice.model.GestaoDrone;

public class SearchedGestaoDrones {
	
	private Long idGestaoDrones;
	private String modeloDrone;
	private Long numSerie;
	private Long numLicenca;
	private LocalDate emissaoLicenca;
	private LocalDate validade;
	private LocalDateTime dataVoo;
	private double duracaoVoo;
	private double horarioVoo;
	private String coordenadasLatitudeInicioVoo;
	private String coordenadasLongitudeInicioVoo;
	private String coordenadasLatitudeFimVoo;
	private String coordenadasLongitudeFimVoo;
	private double altitudeVoo;
	private double velocidadeMediaVoo;
	private double horasTotal;
	private double capacidadeCarga;
	private double capacidadeBateria;
	
	public Long getIdGestaoDrones() {
		return idGestaoDrones;
	}
	public void setIdGestaoDrones(Long idGestaoDrones) {
		this.idGestaoDrones = idGestaoDrones;
	}
	public String getModeloDrone() {
		return modeloDrone;
	}
	public void setModeloDrone(String modeloDrone) {
		this.modeloDrone = modeloDrone;
	}
	public Long getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(Long numSerie) {
		this.numSerie = numSerie;
	}
	public Long getNumLicenca() {
		return numLicenca;
	}
	public void setNumLicenca(Long numLicenca) {
		this.numLicenca = numLicenca;
	}
	public LocalDate getEmissaoLicenca() {
		return emissaoLicenca;
	}
	public void setEmissaoLicenca(LocalDate emissaoLicenca) {
		this.emissaoLicenca = emissaoLicenca;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public LocalDateTime getDataVoo() {
		return dataVoo;
	}
	public void setDataVoo(LocalDateTime dataVoo) {
		this.dataVoo = dataVoo;
	}
	public double getDuracaoVoo() {
		return duracaoVoo;
	}
	public void setDuracaoVoo(double duracaoVoo) {
		this.duracaoVoo = duracaoVoo;
	}
	public double getHorarioVoo() {
		return horarioVoo;
	}
	public void setHorarioVoo(double horarioVoo) {
		this.horarioVoo = horarioVoo;
	}
	public String getCoordenadasLatitudeInicioVoo() {
		return coordenadasLatitudeInicioVoo;
	}
	public void setCoordenadasLatitudeInicioVoo(String coordenadasLatitudeInicioVoo) {
		this.coordenadasLatitudeInicioVoo = coordenadasLatitudeInicioVoo;
	}
	public String getCoordenadasLongitudeInicioVoo() {
		return coordenadasLongitudeInicioVoo;
	}
	public void setCoordenadasLongitudeInicioVoo(String coordenadasLongitudeInicioVoo) {
		this.coordenadasLongitudeInicioVoo = coordenadasLongitudeInicioVoo;
	}
	public String getCoordenadasLatitudeFimVoo() {
		return coordenadasLatitudeFimVoo;
	}
	public void setCoordenadasLatitudeFimVoo(String coordenadasLatitudeFimVoo) {
		this.coordenadasLatitudeFimVoo = coordenadasLatitudeFimVoo;
	}
	public String getCoordenadasLongitudeFimVoo() {
		return coordenadasLongitudeFimVoo;
	}
	public void setCoordenadasLongitudeFimVoo(String coordenadasLongitudeFimVoo) {
		this.coordenadasLongitudeFimVoo = coordenadasLongitudeFimVoo;
	}
	public double getAltitudeVoo() {
		return altitudeVoo;
	}
	public void setAltitudeVoo(double altitudeVoo) {
		this.altitudeVoo = altitudeVoo;
	}
	public double getVelocidadeMediaVoo() {
		return velocidadeMediaVoo;
	}
	public void setVelocidadeMediaVoo(double velocidadeMediaVoo) {
		this.velocidadeMediaVoo = velocidadeMediaVoo;
	}
	public double getHorasTotal() {
		return horasTotal;
	}
	public void setHorasTotal(double horasTotal) {
		this.horasTotal = horasTotal;
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public double getCapacidadeBateria() {
		return capacidadeBateria;
	}
	public void setCapacidadeBateria(double capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}
	
	public static SearchedGestaoDrones toDto(GestaoDrone gestaoDrone) {
		SearchedGestaoDrones dto = new SearchedGestaoDrones();
		dto.setIdGestaoDrones(gestaoDrone.getIdGestaoDrones());
		dto.setModeloDrone(gestaoDrone.getModeloDrone());
		dto.setNumSerie(gestaoDrone.getNumSerie());
		dto.setNumLicenca(gestaoDrone.getNumLicenca());
		dto.setEmissaoLicenca(gestaoDrone.getEmissaoLicenca());
		dto.setValidade(gestaoDrone.getValidade());
		dto.setDataVoo(gestaoDrone.getDataVoo());
		dto.setDuracaoVoo(gestaoDrone.getDuracaoVoo());
		dto.setHorarioVoo(gestaoDrone.getHorarioVoo());
		dto.setCoordenadasLatitudeInicioVoo(gestaoDrone.getCoordenadasLatitudeInicioVoo());
		dto.setCoordenadasLatitudeFimVoo(gestaoDrone.getCoordenadasLatitudeFimVoo());
		dto.setCoordenadasLongitudeInicioVoo(gestaoDrone.getCoordenadasLongitudeInicioVoo());
		dto.setCoordenadasLongitudeFimVoo(gestaoDrone.getCoordenadasLongitudeFimVoo());
		dto.setAltitudeVoo(gestaoDrone.getAltitudeVoo());
		dto.setVelocidadeMediaVoo(gestaoDrone.getVelocidadeMediaVoo());
		dto.setHorasTotal(gestaoDrone.getHorasTotal());
		dto.setCapacidadeCarga(gestaoDrone.getCapacidadeCarga());
		dto.setCapacidadeBateria(gestaoDrone.getCapacidadeBateria());
		return dto;
	}
	
	
}
