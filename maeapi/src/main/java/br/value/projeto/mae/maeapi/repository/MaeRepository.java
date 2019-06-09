package br.value.projeto.mae.maeapi.repository;

import br.value.projeto.mae.maeapi.model.Mae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaeRepository extends JpaRepository<Mae, Long> {
}
