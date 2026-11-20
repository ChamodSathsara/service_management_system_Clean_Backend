package com.gestetner.servvista.application.dto.organization;

import com.gestetner.servvista.domain.Enums.Organization.Area;

public record CityResponse(
        Long cityId,
        Area area,
        String cityName,
        Boolean isActive
) {
}
