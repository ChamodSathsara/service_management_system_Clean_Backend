package com.gestetner.servvista.application.port.out.attachments;


import com.gestetner.servvista.domain.entity.attachments.InstallationAttachment;
import com.gestetner.servvista.domain.entity.attachments.InstallationAttachmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link InstallationAttachment}.
 */
@Repository
public interface InstallationAttachmentRepository extends JpaRepository<InstallationAttachment, InstallationAttachmentId> {
}
