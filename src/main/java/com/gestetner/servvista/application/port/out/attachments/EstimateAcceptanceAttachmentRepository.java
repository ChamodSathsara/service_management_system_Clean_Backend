package com.gestetner.servvista.application.port.out.attachments;


import com.gestetner.servvista.domain.entity.attachments.EstimateAcceptanceAttachment;
import com.gestetner.servvista.domain.entity.attachments.EstimateAcceptanceAttachmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link EstimateAcceptanceAttachment}.
 */
@Repository
public interface EstimateAcceptanceAttachmentRepository extends JpaRepository<EstimateAcceptanceAttachment, EstimateAcceptanceAttachmentId> {
}
