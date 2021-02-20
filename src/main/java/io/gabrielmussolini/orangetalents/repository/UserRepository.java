package io.gabrielmussolini.orangetalents.repository;

import io.gabrielmussolini.orangetalents.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<io.gabrielmussolini.orangetalents.models.User, Long> {
    User findByEmail(String email);
}
