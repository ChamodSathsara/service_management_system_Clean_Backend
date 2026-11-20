package com.gestetner.servvista.application.dto.reports;

import com.gestetner.servvista.domain.Enums.Agreements.AgreementStatus;
import com.gestetner.servvista.domain.Enums.Agreements.AgreementType;
import com.gestetner.servvista.domain.Enums.Organization.Area;
import com.gestetner.servvista.domain.Enums.Organization.Company;
import com.gestetner.servvista.domain.Enums.Organization.Division;
import com.gestetner.servvista.domain.Enums.Services.ServiceScheduleStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ServiceVisitReportRow(
        Long serviceScheduleId,
        String machineReferenceNumber,
        String serialNumber,
        Company company,
        Division division,
        String customerName,
        String siteName,
        Area area,
        String agreementNumber,
        AgreementType agreementType,
        AgreementStatus agreementStatus,
        Integer agreementYearNumber,
        Integer visitNumber,
        ServiceScheduleStatus visitStatus,
        String technicianCode,
        String technicianName,
        LocalDate expectedVisitDate,
        LocalDate scheduledDate,
        LocalDate actualVisitDate,
        String startNote,
        String solutionCode,
        String solutionDescription,
        String solutionNote,
        LocalDateTime createdAt,
        LocalDateTime startedAt,
        LocalDateTime completedAt
) {
}
