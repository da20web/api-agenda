package io.github.da20web.agendaapi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY funciona como auto-incremento
	private Integer id;

	public Integer getId() {
		return id;
	}

	public Contato() {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.favorito = favorito;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getFavorito() {
		return favorito;
	}

	public void setFavorito(Boolean favorito) {
		this.favorito = favorito;
	}

	@Column // Mesmo nome das colunas do banco
	private String nome;

	@Column
	private String email;

	@Column
	private Boolean favorito;

}
