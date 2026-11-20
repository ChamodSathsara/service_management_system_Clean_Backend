package com.gestetner.servvista.application.dto.machines;

import com.gestetner.servvista.domain.Enums.Organization.Area;

public record CustomerSiteOptionResponse(
        Long customerSiteId,
        Long customerId,
        String siteName,
        String address,
        Area area
) {}
