package com.gestetner.servvista.application.port.out.services;

import com.gestetner.servvista.domain.entity.services.ServiceRecall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link ServiceRecall}.
 */
@Repository
public interface ServiceRecallRepository extends JpaRepository<ServiceRecall, Long> {
}
