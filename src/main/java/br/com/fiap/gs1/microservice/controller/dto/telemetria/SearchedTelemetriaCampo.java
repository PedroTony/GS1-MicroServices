package br.com.fiap.gs1.microservice.controller.dto.telemetria;

import java.time.LocalDateTime;

import br.com.fiap.gs1.microservice.model.TelemetriaCampo;

public class SearchedTelemetriaCampo {
	
	private Long idTelemetriaDrones;
	private String latitude;
	private String longitude;
	private double altitude;
	private double velocidade;
	private Integer direcao;
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

	public static SearchedTelemetriaCampo toDto(TelemetriaCampo telemetriaCampo) {
		SearchedTelemetriaCampo dto = new SearchedTelemetriaCampo();
		dto.setIdTelemetriaDrones(telemetriaCampo.getIdTelemetriaDrones());
		dto.setLatitude(telemetriaCampo.getLatitude());
		dto.setLongitude(telemetriaCampo.getLongitude());
		dto.setAltitude(telemetriaCampo.getAltitude());
		dto.setVelocidade(telemetriaCampo.getVelocidade());
		dto.setDirecao(telemetriaCampo.getDirecao());
		dto.setTempo(telemetriaCampo.getTempo());
		return dto;
	}
	
}
