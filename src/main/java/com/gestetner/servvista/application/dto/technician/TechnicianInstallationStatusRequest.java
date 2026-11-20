package com.gestetner.servvista.application.dto.technician;

import com.gestetner.servvista.domain.Enums.Installations.InstallationJobStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TechnicianInstallationStatusRequest(
        @NotNull InstallationJobStatus status,
        @Size(max = 255) String note
) {
}
