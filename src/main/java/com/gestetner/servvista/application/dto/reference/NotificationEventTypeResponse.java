package com.gestetner.servvista.application.dto.reference;

import com.gestetner.servvista.domain.Enums.Notifications.NotificationEventCode;

public record NotificationEventTypeResponse(
        Long notificationEventTypeId,
        NotificationEventCode eventCode,
        String description
) {
}
