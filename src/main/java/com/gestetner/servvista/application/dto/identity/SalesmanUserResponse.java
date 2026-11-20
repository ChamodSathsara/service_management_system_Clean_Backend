package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Organization.Company;
import java.util.List;

public record SalesmanUserResponse(
        UserResponse user,
        Long salesmanId,
        String salesmanCode,
        Company company,
        List<Company> companies
) {
}
