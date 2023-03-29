package io.github.da20web.agendaapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.da20web.agendaapi.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
