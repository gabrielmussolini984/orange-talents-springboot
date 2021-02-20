package io.gabrielmussolini.orangetalents.repository;

import io.gabrielmussolini.orangetalents.models.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {
}
