package com.gestetner.servvista.application.port.out.attachments;


import com.gestetner.servvista.domain.entity.attachments.EstimateAttachment;
import com.gestetner.servvista.domain.entity.attachments.EstimateAttachmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link EstimateAttachment}.
 */
@Repository
public interface EstimateAttachmentRepository extends JpaRepository<EstimateAttachment, EstimateAttachmentId> {
}
