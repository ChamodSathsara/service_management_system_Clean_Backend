package com.gestetner.servvista.application.port.out.machines;

import com.gestetner.servvista.domain.entity.machines.MachineTechnicianAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gestetner.servvista.domain.Enums.Machines.TechnicianAssignmentRole;
import java.util.List;

/**
 * Spring Data JPA repository for {@link MachineTechnicianAssignment}.
 */
@Repository
public interface MachineTechnicianAssignmentRepository extends JpaRepository<MachineTechnicianAssignment, Long> {
    List<MachineTechnicianAssignment> findAllByMachineIdOrderByAssignedFromDescMachineTechnicianAssignmentIdDesc(Long machineId);
    List<MachineTechnicianAssignment> findAllByMachineIdAndAssignmentRoleAndIsCurrentTrue(
            Long machineId, TechnicianAssignmentRole assignmentRole);
}
