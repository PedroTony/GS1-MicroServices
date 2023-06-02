package br.com.fiap.gs1.microservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Drones")
public class GestaoDrone {
	//Identificador do drone (id)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "idGestaoDrones")
	private Long idGestaoDrones;

	//Modelo do drone
	private String modeloDrone;

	//Número de série (unique)
	@Column(unique = true)
	private Long numSerie;

	//Licença para voar (1)
	private Long numLicenca;

	//Licença para voar (2)
	private LocalDate emissaoLicenca;

	//Licença para voar (3)
	private LocalDate validade;

	//Histórico de voo (1)
	private LocalDateTime dataVoo;
	
	//Histórico de voo (2)
	private double duracaoVoo;
	
	//Histórico de voo (3)
	private double horarioVoo;
	
	//Histórico de voo (4)
	private String coordenadasLatitudeInicioVoo;
	private String coordenadasLongitudeInicioVoo;
	
	//Histórico de voo (5)
	private String coordenadasLatitudeFimVoo;
	private String coordenadasLongitudeFimVoo;
	
	//Histórico de voo (6)
	private double altitudeVoo;
	
	//Histórico de voo (7)
	private double velocidadeMediaVoo;
	
	//Horas de voo
	private double horasTotal;
	
	//Capacidade de Carga
	private double capacidadeCarga;
	
	//Capacidade batéria
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

	


}
