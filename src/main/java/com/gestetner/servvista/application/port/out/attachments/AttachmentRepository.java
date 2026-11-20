package com.gestetner.servvista.application.port.out.attachments;


import com.gestetner.servvista.domain.entity.attachments.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link Attachment}.
 */
@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
