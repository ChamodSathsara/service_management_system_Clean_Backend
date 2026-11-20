package com.gestetner.servvista.application.dto.breakdowns;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record BreakdownStartRequest(
        @NotBlank String startNote,
        @NotNull @Positive Long meterCounterTypeId,
        @NotNull @PositiveOrZero Long meterReading,
        @NotNull @Positive Long capturedByUserId,
        @Size(max = 255) String meterReadingNote
) {
}
