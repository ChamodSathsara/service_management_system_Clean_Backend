package com.gestetner.servvista.application.dto.breakdowns;

import com.gestetner.servvista.domain.Enums.Breakdowns.BreakdownAssignmentStatus;

import java.time.LocalDateTime;

public record BreakdownAssignmentResponse(
        Long assignmentId,
        Long breakdownId,
        Long technicianId,
        LocalDateTime assignedAt,
        Long assignedBy,
        LocalDateTime unassignedAt,
        BreakdownAssignmentStatus assignmentStatus,
        String reason
) {
}
