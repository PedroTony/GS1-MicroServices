package br.com.fiap.gs1.microservice.controller.dto.telemetria;

import java.time.LocalDateTime;

import br.com.fiap.gs1.microservice.model.TelemetriaCampo;

public class TelemetriaCampoRequestCreate {
	
	private String latitude;
	private String longitude;
	private double altitude;
	private double velocidade;
	private Integer direcao;
	private LocalDateTime tempo;
	
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

	public TelemetriaCampo toModel() {
		TelemetriaCampo dto = new TelemetriaCampo();
		dto.setLatitude(getLatitude());
		dto.setLongitude(getLongitude());
		dto.setAltitude(getAltitude());
		dto.setVelocidade(getVelocidade());
		dto.setDirecao(getDirecao());
		dto.setTempo(getTempo());
		return dto;
	}
}
