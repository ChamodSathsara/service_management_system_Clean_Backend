package com.gestetner.servvista.application.dto.machines;

import com.gestetner.servvista.domain.Enums.Machines.MachineStatus;
import com.gestetner.servvista.domain.Enums.Organization.Company;
import com.gestetner.servvista.domain.Enums.Organization.Division;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record MachineData(
        @NotBlank @Size(max = 100) String serialNumber,
        @NotNull Company company,
        @NotNull Division division,
        @NotNull @Positive Long modelId,
        @NotNull MachineStatus currentStatus,
        @Positive Long currentMainTechnicianId,
        @Positive Long currentServiceTechnicianId,
        @Positive Long dealerId,
        @Positive Long repId,
        @Positive Long salesmanId,
        LocalDate originalInstallDate,
        String note,
        @Size(max = 50) String creditNoteNumber
) {
}
