package com.gestetner.servvista.application.port.out.services;

import com.gestetner.servvista.domain.entity.services.SolutionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link SolutionType}.
 */
@Repository
public interface SolutionTypeRepository extends JpaRepository<SolutionType, Long> {

    boolean existsBySolutionCodeIgnoreCase(String solutionCode);

    boolean existsBySolutionCodeIgnoreCaseAndSolutionTypeIdNot(
            String solutionCode, Long solutionTypeId);
}
