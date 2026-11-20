package com.gestetner.servvista.application.dto.technician;

public record TechnicianEstimateMachineOption(
        Long machineId,
        String machineReferenceNumber,
        Long modelId,
        String modelNumber,
        String modelName) {
}
