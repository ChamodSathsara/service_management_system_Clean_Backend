package com.gestetner.servvista.application.port.out.notifications;

import com.gestetner.servvista.domain.entity.notifications.NotificationDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link NotificationDelivery}.
 */
@Repository
public interface NotificationDeliveryRepository extends JpaRepository<NotificationDelivery, Long> {
}
