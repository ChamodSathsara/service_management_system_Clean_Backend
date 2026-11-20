package com.gestetner.servvista.application.dto.catalog;

import com.gestetner.servvista.domain.Enums.Organization.Company;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.Set;

public record MachineModelRequest(

        @NotNull
        Company company,

        Set<Company> companies,

        @NotNull
        @Positive
        Long manufacturerId,

        @NotNull
        @Positive
        Long machineTypeId,

        @NotBlank
        @Size(max = 60)
        String modelNumber,

        @NotBlank
        @Size(max = 150)
        String modelName,

        @Size(max = 255)
        String description,

        Boolean isActive,

        @Positive
        Long createdBy
) {}
