package com.gestetner.servvista.application.dto.installations;

import com.gestetner.servvista.domain.Enums.Installations.InstallationJobStatus;
import com.gestetner.servvista.domain.Enums.Organization.Company;
import com.gestetner.servvista.domain.Enums.Organization.Division;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import com.gestetner.servvista.application.dto.technician.JobPartyDetailsResponse;
import java.util.List;

public record InstallationJobResponse(
        Long installationJobId,
        String jobNumber,
        String machineReferenceNumber,
        Company company,
        Division division,
        Long customerId,
        String customerName,
        Long customerSiteId,
        String siteName,
        String siteAddress,
        BigDecimal latitude,
        BigDecimal longitude,
        Long machineInvoiceId,
        String invoiceNumber,
        Long dealerId,
        Long repId,
        Long assignedTechnicianId,
        String technicianName,
        LocalDate expectedInstallDate,
        InstallationJobStatus status,
        Long createdBy,
        LocalDateTime createdAt,
        List<InstallationStatusHistoryResponse> statusHistory,
        JobPartyDetailsResponse partyDetails
) {
}
