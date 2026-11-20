package com.gestetner.servvista.application.dto.machines;

import com.gestetner.servvista.domain.Enums.Machines.MachineStatus;

import java.time.LocalDateTime;

public record MachineStatusHistoryResponse(
        Long machineStatusHistoryId,
        Long machineId,
        String machineReferenceNumber,
        MachineStatus previousStatus,
        MachineStatus newStatus,
        LocalDateTime changedAt,
        Long changedBy,
        String reason
) {
}
