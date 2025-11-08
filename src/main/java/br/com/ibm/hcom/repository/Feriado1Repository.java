package br.com.ibm.hcom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.ibm.hcom.domain.Feriado1;

@RepositoryRestResource(path = "feriado1")
public interface Feriado1Repository extends CrudRepository<Feriado1, Long> {
}