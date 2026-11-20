package com.gestetner.servvista.application.dto.catalog;

public record MachineTypeResponse(Long machineTypeId, String machineTypeName,
                                  String machineTypeDescription, Boolean isActive) {}
