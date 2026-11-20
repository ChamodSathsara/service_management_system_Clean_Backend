package com.gestetner.servvista.application.port.out.notifications;

import com.gestetner.servvista.domain.entity.notifications.NotificationRecipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link NotificationRecipient}.
 */
@Repository
public interface NotificationRecipientRepository extends JpaRepository<NotificationRecipient, Long> {
}
