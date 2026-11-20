package com.gestetner.servvista.application.dto.identity;

import com.gestetner.servvista.domain.Enums.Organization.Company;

import java.util.List;

public interface CompanyAssignmentRequest extends UserAccountRequest {
    List<Company> companies();
}
