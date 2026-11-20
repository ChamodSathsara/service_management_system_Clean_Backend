package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Organization.Area;
import com.gestetner.servvista.domain.Enums.Organization.Division;

public interface UserAccountRequest {
    String userName();
    String mobileNumber();
    String email();
    String password();
    Boolean isActive();
    Division division();
    Area area();
    Long createdBy();
}
