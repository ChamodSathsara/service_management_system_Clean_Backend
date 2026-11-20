package com.gestetner.servvista.application.port.out.estimates;


import com.gestetner.servvista.domain.entity.estimates.EstimateAcceptance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * Spring Data JPA repository for {@link EstimateAcceptance}.
 */
@Repository
public interface EstimateAcceptanceRepository extends JpaRepository<EstimateAcceptance, Long> {
    Optional<EstimateAcceptance> findByEstimateId(Long estimateId);
    void deleteAllByEstimateId(Long estimateId);
}
