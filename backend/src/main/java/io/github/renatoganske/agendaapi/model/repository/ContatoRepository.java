package io.github.renatoganske.agendaapi.model.repository;

import io.github.renatoganske.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
