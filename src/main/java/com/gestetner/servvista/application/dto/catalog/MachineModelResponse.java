package com.gestetner.servvista.application.dto.catalog;

import com.gestetner.servvista.domain.Enums.Organization.Company;
import java.time.LocalDateTime;
import java.util.Set;

public record MachineModelResponse(
        Long modelId, Company company, Set<Company> companies, Long manufacturerId, String manufacturerName,
        Long machineTypeId, String machineTypeName, String modelNumber, String modelName,
        String description, Boolean isActive, LocalDateTime createdAt, Long createdBy
) {}
