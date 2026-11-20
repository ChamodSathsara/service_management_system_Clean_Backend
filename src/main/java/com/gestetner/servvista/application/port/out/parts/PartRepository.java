package com.gestetner.servvista.application.port.out.parts;

import com.gestetner.servvista.domain.entity.parts.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link Part}.
 */
@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
    boolean existsByPartCodeIgnoreCase(String partCode);
    boolean existsByPartCodeIgnoreCaseAndPartIdNot(String partCode, Long partId);
}
