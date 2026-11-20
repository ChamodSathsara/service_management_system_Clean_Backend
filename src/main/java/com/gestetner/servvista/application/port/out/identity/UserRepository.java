package com.gestetner.servvista.application.port.out.identity;

import com.gestetner.servvista.domain.entity.identity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data JPA repository for {@link User}.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmailIgnoreCase(String email);

    boolean existsByEmailIgnoreCaseAndUserIdNot(String email, Long userId);

    Optional<User> findByEmailIgnoreCase(String email);
}
