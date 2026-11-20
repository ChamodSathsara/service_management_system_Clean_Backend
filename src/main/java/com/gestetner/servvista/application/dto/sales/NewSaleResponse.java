package com.gestetner.servvista.application.dto.sales;

import com.gestetner.servvista.domain.Enums.Agreements.AgreementStatus;
import com.gestetner.servvista.domain.Enums.Installations.InstallationJobStatus;
import com.gestetner.servvista.domain.Enums.Machines.MachineStatus;
import com.gestetner.servvista.domain.Enums.Machines.WarrantyStatus;

import java.time.LocalDateTime;

public record NewSaleResponse(
        Long machineId,
        String machineReferenceNumber,
        String serialNumber,
        MachineStatus machineStatus,
        Long customerSiteId,
        Long siteContactId,
        Long machineStatusHistoryId,
        Long machineAssignmentId,
        Long mainTechnicianAssignmentId,
        Long serviceTechnicianAssignmentId,
        Long machineWarrantyId,
        WarrantyStatus warrantyStatus,
        Long liveLocationMachineId,
        Long installationJobId,
        String installationJobNumber,
        InstallationJobStatus installationStatus,
        Long agreementId,
        String agreementNumber,
        AgreementStatus agreementStatus,
        LocalDateTime createdAt
) {
}
