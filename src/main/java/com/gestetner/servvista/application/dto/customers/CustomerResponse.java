package com.gestetner.servvista.application.dto.customers;

import com.gestetner.servvista.domain.Enums.Customers.CustomerGrade;
import com.gestetner.servvista.domain.Enums.Customers.CustomerSegment;
import com.gestetner.servvista.domain.Enums.Customers.CustomerType;
import com.gestetner.servvista.domain.Enums.Organization.Company;

import java.time.LocalDateTime;
import java.util.List;

public record CustomerResponse(
        Long customerId,
        String sageCode,
        String customerName,
        String addressLine1,
        String addressLine2,
        String addressLine3,
        String headOfficeTelNumber,
        String headOfficeEmail,
        Boolean isActive,
        CustomerGrade customerGrade,
        CustomerType customerType,
        CustomerSegment customerSegment,
        LocalDateTime createdAt,
        Long createdBy,
        LocalDateTime updatedAt,
        Long updatedBy,
        List<Company> companies,
        CustomerSalesmanAssignmentResponse salesmanAssignment
) {
}
