package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Organization.Area;
import com.gestetner.servvista.domain.Enums.Organization.Division;
import jakarta.validation.constraints.*;

public record UpdateStoresUserRequest(
        @NotBlank @Size(max = 150) String userName,
        @Size(max = 20) String mobileNumber,
        @NotBlank @Email @Size(max = 150) String email,
        @Size(min = 8, max = 72) String password,
        @NotNull Boolean isActive,
        Division division,
        @NotNull Area area,
        @Positive Long updatedBy
) implements UpdateUserAccountRequest {
}
