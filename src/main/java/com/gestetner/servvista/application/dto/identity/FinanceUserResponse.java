package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Organization.Company;
import java.util.List;

public record FinanceUserResponse(
        UserResponse user,
        Long financeId,
        List<Company> companies
) {
}
