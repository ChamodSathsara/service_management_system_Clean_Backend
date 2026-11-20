package com.gestetner.servvista.application.port.out.estimates;


import com.gestetner.servvista.domain.entity.estimates.EstimateStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Spring Data JPA repository for {@link EstimateStatusHistory}.
 */
@Repository
public interface EstimateStatusHistoryRepository extends JpaRepository<EstimateStatusHistory, Long> {
    List<EstimateStatusHistory> findAllByEstimateIdOrderByChangedAtAsc(Long estimateId);
    void deleteAllByEstimateId(Long estimateId);
}
