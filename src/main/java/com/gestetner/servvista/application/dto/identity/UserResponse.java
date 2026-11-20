package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Identity.Role;
import com.gestetner.servvista.domain.Enums.Organization.Area;
import com.gestetner.servvista.domain.Enums.Organization.Division;

import java.time.LocalDateTime;

public record UserResponse(
        Long userId,
        String userName,
        String mobileNumber,
        String email,
        Boolean isActive,
        Division division,
        Area area,
        Role role,
        LocalDateTime createdAt,
        Long createdBy
) {
}
