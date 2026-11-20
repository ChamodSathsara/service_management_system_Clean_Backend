package com.gestetner.servvista.application.dto.installations;

import com.gestetner.servvista.domain.Enums.Installations.InstallationJobStatus;

import java.time.LocalDateTime;

public record InstallationStatusHistoryResponse(
        Long historyId,
        InstallationJobStatus previousStatus,
        InstallationJobStatus newStatus,
        LocalDateTime changedAt,
        Long changedBy,
        String note
) {
}
