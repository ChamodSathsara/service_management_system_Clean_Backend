package com.gestetner.servvista.application.port.out.breakdowns;

import com.gestetner.servvista.domain.entity.breakdowns.BreakdownRecall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for {@link BreakdownRecall}.
 */
@Repository
public interface BreakdownRecallRepository extends JpaRepository<BreakdownRecall, Long> {

    @org.springframework.data.jpa.repository.Query(value = "select coalesce(max(cast(substring(recall_number, 3) as unsigned)), 0) from breakdown_recall where recall_number regexp '^RC[0-9]+$'", nativeQuery = true)
    long findMaximumRecallSequence();

    List<BreakdownRecall> findAllByBreakdownIdOrderByRecalledAtDesc(Long breakdownId);

    void deleteAllByBreakdownId(Long breakdownId);
}
