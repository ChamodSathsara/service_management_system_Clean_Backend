package com.gestetner.servvista.application.dto.technician;

public record JobSiteContactResponse(
        Long siteContactId,
        String contactName,
        String designation,
        String mobileNumber,
        String email
) {
}
