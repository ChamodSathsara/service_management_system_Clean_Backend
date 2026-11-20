package com.gestetner.servvista.application.port.out.notifications;

import com.gestetner.servvista.domain.Enums.Notifications.NotificationEventCode;
import com.gestetner.servvista.domain.entity.notifications.NotificationEventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link NotificationEventType}.
 */
@Repository
public interface NotificationEventTypeRepository extends JpaRepository<NotificationEventType, Long> {

    boolean existsByEventCode(NotificationEventCode eventCode);

    boolean existsByEventCodeAndNotificationEventTypeIdNot(
            NotificationEventCode eventCode, Long notificationEventTypeId);
}
