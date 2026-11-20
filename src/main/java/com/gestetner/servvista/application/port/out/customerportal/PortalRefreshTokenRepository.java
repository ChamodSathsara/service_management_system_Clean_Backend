package com.gestetner.servvista.application.port.out.customerportal;


import com.gestetner.servvista.domain.entity.customerportal.PortalRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * Spring Data JPA repository for {@link PortalRefreshToken}.
 */
@Repository
public interface PortalRefreshTokenRepository extends JpaRepository<PortalRefreshToken, Long> {
    Optional<PortalRefreshToken> findByTokenHash(String tokenHash);
}
