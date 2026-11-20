package com.gestetner.servvista.application.dto.reference;

import com.gestetner.servvista.domain.Enums.Meters.MeterCounterCode;

public record MeterCounterTypeResponse(
        Long meterCounterTypeId,
        MeterCounterCode counterCode,
        String counterName,
        Boolean isActive
) {
}
