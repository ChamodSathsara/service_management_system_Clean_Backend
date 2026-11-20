package com.gestetner.servvista.application.port.out.attachments;


import com.gestetner.servvista.domain.entity.attachments.AgreementAttachment;
import com.gestetner.servvista.domain.entity.attachments.AgreementAttachmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link AgreementAttachment}.
 */
@Repository
public interface AgreementAttachmentRepository extends JpaRepository<AgreementAttachment, AgreementAttachmentId> {
}
