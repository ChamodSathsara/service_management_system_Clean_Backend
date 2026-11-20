package com.gestetner.servvista.application.dto.portal;

import java.time.LocalDateTime;

public record MachinePortalRegistrationResponse(
        Long portalAccountId,
        Long portalAccountMachineId,
        Long machineId,
        String machineReferenceNumber,
        String contactEmail,
        Long loginOtpId,
        LocalDateTime otpExpiresAt,
        String otpCode
) {
}
