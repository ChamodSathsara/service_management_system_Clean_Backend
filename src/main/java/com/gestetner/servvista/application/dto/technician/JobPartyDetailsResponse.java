package com.gestetner.servvista.application.dto.technician;

public record JobPartyDetailsResponse(
        JobCustomerDetailsResponse customer,
        JobSiteDetailsResponse site,
        JobSiteContactResponse primaryContact
) {
}
