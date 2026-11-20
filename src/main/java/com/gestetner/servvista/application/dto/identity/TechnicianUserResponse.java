package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Identity.TechnicianRole;
import com.gestetner.servvista.domain.Enums.Organization.Company;
import com.gestetner.servvista.domain.Enums.Organization.Division;
import java.util.List;

public record TechnicianUserResponse(
        UserResponse user,
        Long technicianId,
        String techCode,
        TechnicianRole technicianRole,
        List<Company> companies,
        List<Division> divisions,
        String cities
) {
}
