package tech.devinhouse.veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.veiculos.model.Multa;

public interface MultaRepository extends JpaRepository<Multa, Integer> {
}
