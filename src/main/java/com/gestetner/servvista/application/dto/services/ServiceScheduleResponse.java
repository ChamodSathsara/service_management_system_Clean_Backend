package com.gestetner.servvista.application.dto.services;

import com.gestetner.servvista.domain.Enums.Services.ServiceScheduleStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import com.gestetner.servvista.application.dto.technician.JobPartyDetailsResponse;

public record ServiceScheduleResponse(
        Long serviceScheduleId,
        Long agreementId,
        String agreementNumber,
        Long machineId,
        String machineReferenceNumber,
        String siteName,
        String siteAddress,
        BigDecimal latitude,
        BigDecimal longitude,
        Integer agreementYearNumber,
        Integer visitNumber,
        LocalDate expectedVisitDate,
        LocalDate scheduledDate,
        LocalDate actualVisitDate,
        ServiceScheduleStatus status,
        Long assignedTechnicianId,
        String assignedTechnicianName,
        String startNote,
        LocalDateTime startedAt,
        LocalDateTime completedAt,
        Long solutionTypeId,
        String solutionNote,
        LocalDateTime createdAt,
        JobPartyDetailsResponse partyDetails
) {
}
