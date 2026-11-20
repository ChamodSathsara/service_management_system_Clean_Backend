package com.gestetner.servvista.application.port.out.installations;


import com.gestetner.servvista.domain.entity.installations.InstallationStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for {@link InstallationStatusHistory}.
 */
@Repository
public interface InstallationStatusHistoryRepository extends JpaRepository<InstallationStatusHistory, Long> {

    List<InstallationStatusHistory> findAllByInstallationJobIdOrderByChangedAtAsc(
            Long installationJobId);
}
