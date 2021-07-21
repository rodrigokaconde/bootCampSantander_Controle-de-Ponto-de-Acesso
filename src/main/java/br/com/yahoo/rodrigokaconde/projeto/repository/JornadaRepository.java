package br.com.yahoo.rodrigokaconde.projeto.repository;

import br.com.yahoo.rodrigokaconde.projeto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
