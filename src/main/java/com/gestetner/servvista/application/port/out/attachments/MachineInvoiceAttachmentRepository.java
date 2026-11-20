package com.gestetner.servvista.application.port.out.attachments;


import com.gestetner.servvista.domain.entity.attachments.MachineInvoiceAttachment;
import com.gestetner.servvista.domain.entity.attachments.MachineInvoiceAttachmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link MachineInvoiceAttachment}.
 */
@Repository
public interface MachineInvoiceAttachmentRepository extends JpaRepository<MachineInvoiceAttachment, MachineInvoiceAttachmentId> {
}
