package com.gestetner.servvista.application.dto.breakdowns;

import com.gestetner.servvista.domain.Enums.Breakdowns.BreakdownAssignmentStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record BreakdownAssignmentRequest(
        @NotNull @Positive Long technicianId,
        @Positive Long assignedBy,
        BreakdownAssignmentStatus assignmentStatus,
        @Size(max = 255) String reason
) {
}
