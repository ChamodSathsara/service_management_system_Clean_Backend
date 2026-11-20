package com.gestetner.servvista.application.port.out.agreements;

import com.gestetner.servvista.domain.entity.agreements.AgreementStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for {@link AgreementStatusHistory}.
 */
@Repository
public interface AgreementStatusHistoryRepository extends JpaRepository<AgreementStatusHistory, Long> {

    List<AgreementStatusHistory> findAllByAgreementIdOrderByChangedAtAsc(Long agreementId);

    void deleteAllByAgreementId(Long agreementId);
}
