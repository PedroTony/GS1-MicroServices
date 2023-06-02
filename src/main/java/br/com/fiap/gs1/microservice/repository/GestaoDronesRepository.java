package br.com.fiap.gs1.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.gs1.microservice.model.GestaoDrone;

@Repository
public interface GestaoDronesRepository extends JpaRepository<GestaoDrone, Long> {

}
