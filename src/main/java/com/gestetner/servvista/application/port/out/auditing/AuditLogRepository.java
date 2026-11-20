package com.gestetner.servvista.application.port.out.auditing;


import com.gestetner.servvista.domain.entity.auditing.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link AuditLog}.
 */
@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
