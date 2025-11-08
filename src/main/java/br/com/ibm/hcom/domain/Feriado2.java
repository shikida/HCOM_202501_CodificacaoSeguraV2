package br.com.ibm.hcom.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "feriado2")
public class Feriado2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// ASVS 5.0.0 item 2.2.2
	@Size(max=10) //aqui ele retorna validation de erro -- ele nao tentou inserir
	@Column(name = "nome", length = 10) // aqui ele retorna SQL de erro -- ele tentou inserir
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Feriado2 [id=" + id + ", nome=" + nome + "]";
	}

}
