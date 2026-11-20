package com.gestetner.servvista.application.port.out.notifications;

import com.gestetner.servvista.domain.entity.notifications.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link Notification}.
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
