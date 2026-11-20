package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Organization.Company;
import java.util.List;

public record StoresUserResponse(
        UserResponse user,
        Long storesUserId,
        List<Company> companies
) {
}
