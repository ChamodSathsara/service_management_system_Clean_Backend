package com.gestetner.servvista.application.dto.estimates;
import com.gestetner.servvista.domain.Enums.Estimates.EstimateStatus;
import java.time.LocalDateTime;
import java.util.List;
public record EstimateResponse(Long estimateId, String estimateNumber, Long machineId,
                               String machineReferenceNumber, Long serviceScheduleId, Long breakdownId,
                               Long technicianId, String technicianName, EstimateStatus status,
                               Long approvedBy, LocalDateTime approvedAt, Long createdBy,
                               LocalDateTime createdAt, List<EstimateLineResponse> lines,
                               List<EstimateStatusHistoryResponse> statusHistory,
                               EstimateAcceptanceResponse acceptance) {}
