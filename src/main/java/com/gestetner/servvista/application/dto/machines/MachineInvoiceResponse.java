package com.gestetner.servvista.application.dto.machines;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record MachineInvoiceResponse(
        Long machineInvoiceId,
        String invoiceNumber,
        String belitaInvoiceNumber,
        LocalDate invoiceDate,
        Long customerId,
        String customerName,
        String note,
        Long createdBy,
        LocalDateTime createdAt
) {
}
