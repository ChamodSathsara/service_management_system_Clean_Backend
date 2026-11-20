package com.gestetner.servvista.application.port.out.estimates;


import com.gestetner.servvista.domain.entity.estimates.EstimateLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Spring Data JPA repository for {@link EstimateLine}.
 */
@Repository
public interface EstimateLineRepository extends JpaRepository<EstimateLine, Long> {
    List<EstimateLine> findAllByEstimateIdOrderByEstimateLineId(Long estimateId);
    void deleteAllByEstimateId(Long estimateId);
}
