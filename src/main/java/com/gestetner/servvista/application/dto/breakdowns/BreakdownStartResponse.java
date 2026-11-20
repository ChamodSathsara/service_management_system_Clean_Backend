package com.gestetner.servvista.application.dto.breakdowns;

public record BreakdownStartResponse(
        BreakdownResponse breakdown,
        BreakdownMeterReadingResponse meterReading
) {
}
