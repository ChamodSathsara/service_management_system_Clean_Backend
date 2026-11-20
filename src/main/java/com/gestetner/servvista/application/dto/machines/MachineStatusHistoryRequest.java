package com.gestetner.servvista.application.dto.machines;

import com.gestetner.servvista.domain.Enums.Machines.MachineStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record MachineStatusHistoryRequest(
        @NotNull @Positive Long machineId,
        @NotNull MachineStatus previousStatus,
        @NotNull MachineStatus newStatus,
        @Positive Long changedBy,
        @Size(max = 255) String reason
) {
}
