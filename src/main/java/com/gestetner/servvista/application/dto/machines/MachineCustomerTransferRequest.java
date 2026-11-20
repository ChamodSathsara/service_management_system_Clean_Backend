package com.gestetner.servvista.application.dto.machines;

import com.gestetner.servvista.domain.Enums.Machines.MachineAssignmentType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

public record MachineCustomerTransferRequest(
        @NotNull @Positive Long customerId,
        @NotNull @Positive Long customerSiteId,
        @NotNull MachineAssignmentType assignmentType,
        @NotNull LocalDate effectiveDate,
        @NotNull @Positive Long performedBy,
        String reason
) {}
