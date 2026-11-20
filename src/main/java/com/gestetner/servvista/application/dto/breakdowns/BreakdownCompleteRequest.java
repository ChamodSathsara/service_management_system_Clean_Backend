package com.gestetner.servvista.application.dto.breakdowns;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record BreakdownCompleteRequest(
        @NotNull @Positive Long actualSolutionTypeId,
        @NotBlank String solutionNote
) {
}
