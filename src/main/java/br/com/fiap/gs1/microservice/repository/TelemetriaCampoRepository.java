package br.com.fiap.gs1.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.gs1.microservice.model.TelemetriaCampo;

@Repository
public interface TelemetriaCampoRepository extends JpaRepository<TelemetriaCampo, Long>{

}
