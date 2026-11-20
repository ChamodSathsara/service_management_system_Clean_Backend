package com.gestetner.servvista.application.dto.breakdowns;

public record BreakdownCreateResponse(
        BreakdownResponse breakdown,
        BreakdownAssignmentResponse technicianAssignment
) {
}
