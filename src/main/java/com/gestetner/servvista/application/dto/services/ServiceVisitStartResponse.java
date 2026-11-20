package com.gestetner.servvista.application.dto.services;

public record ServiceVisitStartResponse(
        ServiceScheduleResponse serviceSchedule,
        ServiceVisitMeterReadingResponse meterReading
) {
}
