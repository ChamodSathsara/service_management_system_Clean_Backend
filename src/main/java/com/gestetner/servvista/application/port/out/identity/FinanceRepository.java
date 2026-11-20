package com.gestetner.servvista.application.port.out.identity;

import com.gestetner.servvista.domain.entity.identity.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

@Repository
public interface FinanceRepository extends JpaRepository<Finance, Long> {
    Optional<Finance> findByUserId(Long userId);

    @Query("select finance from Finance finance join fetch finance.user order by finance.financeId")
    List<Finance> findAllWithUser();
}
