package com.gestetner.servvista.application.dto.agreements;

import com.gestetner.servvista.domain.Enums.Agreements.AgreementStatus;

import java.time.LocalDateTime;

public record AgreementStatusHistoryResponse(
        Long historyId,
        AgreementStatus previousStatus,
        AgreementStatus newStatus,
        LocalDateTime changedAt,
        Long changedBy,
        String reason
) {
}
