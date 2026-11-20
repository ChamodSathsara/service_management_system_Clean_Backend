package com.gestetner.servvista.application.dto.reference;

public record SolutionTypeResponse(
        Long solutionTypeId,
        String solutionCode,
        String solutionDescription,
        Boolean isActive
) {
}
