package com.gestetner.servvista.application.dto.machines;

import java.time.LocalDateTime;

public record MachineHistoryEventResponse(
        String eventType,
        String title,
        String description,
        LocalDateTime occurredAt,
        String performedBy
) {}
