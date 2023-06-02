package br.com.fiap.gs1.microservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Telemetrias")
public class TelemetriaCampo {
	//Identificador do drone (id)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "idTelemetriaDrones")
	private Long idTelemetriaDrones;
	
	//Latitude e Longitude (1)
	private String latitude;
	
	//Latitude e Longitude (2)
	private String longitude;
	
	//Altitude
	private double altitude;
	
	//Velocidade
	private double velocidade;
	
	//Direção
	private Integer direcao;
	
	//Tempo
	
	private LocalDateTime tempo;

	public Long getIdTelemetriaDrones() {
		return idTelemetriaDrones;
	}

	public void setIdTelemetriaDrones(Long idTelemetriaDrones) {
		this.idTelemetriaDrones = idTelemetriaDrones;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public Integer getDirecao() {
		return direcao;
	}

	public void setDirecao(Integer direcao) {
		this.direcao = direcao;
	}

	public LocalDateTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}

	
	
}
