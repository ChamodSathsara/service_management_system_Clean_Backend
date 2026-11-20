package com.gestetner.servvista.application.dto.reference;

import com.gestetner.servvista.domain.Enums.Notifications.NotificationEventCode;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record NotificationEventTypeRequest(
        @NotNull NotificationEventCode eventCode,
        @Size(max = 255) String description
) {
}
