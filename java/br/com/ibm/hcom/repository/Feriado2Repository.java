package br.com.ibm.hcom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.ibm.hcom.domain.Feriado2;

@RepositoryRestResource(path = "feriado2")
public interface Feriado2Repository extends CrudRepository<Feriado2, Long> {
}