package com.gestetner.servvista.application.port.out.sales;

import com.gestetner.servvista.domain.entity.sales.NewSaleWorkflow;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface NewSaleWorkflowRepository extends JpaRepository<NewSaleWorkflow, Long> {
    List<NewSaleWorkflow> findAllByOrderByCreatedAtDesc();
    Optional<NewSaleWorkflow> findByInstallationJobId(Long installationJobId);
}
