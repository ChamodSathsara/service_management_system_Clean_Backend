package com.gestetner.servvista.application.dto.catalog;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record MachineTypeRequest(
        @NotBlank @Size(max = 100) String machineTypeName,
        @Size(max = 255) String machineTypeDescription,
        Boolean isActive
) {}
