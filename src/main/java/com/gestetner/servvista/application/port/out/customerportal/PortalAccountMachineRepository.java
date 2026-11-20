package com.gestetner.servvista.application.port.out.customerportal;


import com.gestetner.servvista.domain.entity.customerportal.PortalAccountMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * Spring Data JPA repository for {@link PortalAccountMachine}.
 */
@Repository
public interface PortalAccountMachineRepository extends JpaRepository<PortalAccountMachine, Long> {
    Optional<PortalAccountMachine> findByPortalAccountIdAndMachineIdAndIsActiveTrue(Long portalAccountId, Long machineId);
}
