package com.gestetner.servvista.application.dto.estimates;
import com.gestetner.servvista.domain.Enums.Estimates.EstimateAcceptedByType;
import java.time.LocalDateTime;
public record EstimateAcceptanceResponse(Long estimateAcceptanceId, EstimateAcceptedByType acceptedByType,
                                         Long portalAccountId, Long recordedByUserId,
                                         LocalDateTime acceptedAt, String referenceNumber, String note) {}
