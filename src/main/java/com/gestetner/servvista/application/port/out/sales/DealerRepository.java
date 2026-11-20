package com.gestetner.servvista.application.port.out.sales;

import com.gestetner.servvista.domain.entity.sales.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link Dealer}.
 */
@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long> {
}
