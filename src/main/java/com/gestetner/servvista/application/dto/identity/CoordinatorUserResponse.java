package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Identity.CoordinatorRole;
import com.gestetner.servvista.domain.Enums.Organization.Company;
import java.util.List;

public record CoordinatorUserResponse(
        UserResponse user,
        Long coordinatorId,
        CoordinatorRole coordinatorRole,
        List<Company> companies
) {
}
