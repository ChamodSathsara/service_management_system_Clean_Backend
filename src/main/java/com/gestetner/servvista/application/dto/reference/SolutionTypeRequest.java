package com.gestetner.servvista.application.dto.reference;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SolutionTypeRequest(
        @NotBlank @Size(max = 40) String solutionCode,
        @NotBlank @Size(max = 255) String solutionDescription,
        Boolean isActive
) {
}
