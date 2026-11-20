package com.gestetner.servvista.application.dto.sales;

import com.gestetner.servvista.application.dto.machines.CustomerSiteData;
import com.gestetner.servvista.application.dto.machines.SiteContactData;
import com.gestetner.servvista.domain.Enums.Agreements.*;
import com.gestetner.servvista.domain.Enums.Machines.*;
import com.gestetner.servvista.domain.Enums.Organization.*;
import com.gestetner.servvista.domain.Enums.Sales.NewSaleWorkflowStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.*;
import java.util.List;

public final class NewSaleWorkflowDtos {
    private NewSaleWorkflowDtos() {}

    public record FinanceStageRequest(
            @NotBlank String serialNumber, @NotNull Company company, @NotNull Long modelId,
            @NotNull Long machineInvoiceId, Long dealerId, Long repId,
            String creditNoteNumber, String machineNote, String statusReason,
            @NotNull Long customerId, @NotNull WarrantyType warrantyType,
            @NotNull LocalDate warrantyStart, @NotNull LocalDate warrantyEnd,
            Integer durationMonths, String warrantyNote, @NotNull Division division,
            @NotNull @Valid List<AccessoryRequest> accessories,
            @NotNull @Positive Long performedBy) {}

    public record AccessoryRequest(
            @NotBlank String accessoryId,
            @NotBlank @Size(max=150) String name,
            @Size(max=100) String serialNumber,
            @NotNull @Positive Integer quantity,
            @Size(max=500) String note) {}

    public record StoresStageRequest(
            @NotBlank @Size(max=20) String machineReferenceNumber,
            @AssertTrue Boolean despatchedFromStores,
            @NotNull @Positive Long performedBy) {}

    public record CoordinatorStageRequest(
            @NotNull @Positive Long mainTechnicianId,
            @NotNull @Positive Long serviceTechnicianId,
            @NotNull LocalDate techniciansAssignedFrom,
            LocalDate expectedInstallDate,
            @NotNull AgreementType agreementType,
            @NotNull LocalDate agreementStart,
            @NotNull LocalDate agreementEnd,
            @NotNull @Positive Integer periodYears,
            @NotNull @Positive Integer visitsPerYear,
            @PositiveOrZero BigDecimal annualPayment,
            @PositiveOrZero BigDecimal fullPayment,
            @PositiveOrZero BigDecimal discount,
            @DecimalMin("0") @DecimalMax("100") BigDecimal vatPercentage,
            @PositiveOrZero BigDecimal vatAmount,
            String agreementNote,
            @NotNull @Positive Long performedBy) {}

    public record TechnicianStageRequest(
            @NotNull @Valid CustomerSiteData customerSite,
            @NotNull @Valid SiteContactData siteContact,
            @NotNull MachineAssignmentType assignmentType,
            @NotNull LocalDate assignedFrom,
            @NotNull List<@NotBlank String> receivedAccessoryIds,
            @NotNull @Positive Long performedBy) {}

    public record WorkflowResponse(
            Long workflowId, NewSaleWorkflowStatus status,
            FinanceStageRequest finance, String machineReferenceNumber,
            Boolean despatchedFromStores, CoordinatorStageRequest coordinator,
            TechnicianStageRequest technician, Long installationJobId, Long machineId,
            LocalDateTime createdAt, LocalDateTime updatedAt) {}

    public record WorkflowOptionsResponse(
            java.util.List<com.gestetner.servvista.application.dto.catalog.MachineModelResponse> models,
            java.util.List<com.gestetner.servvista.application.dto.machines.MachineInvoiceResponse> invoices,
            java.util.List<com.gestetner.servvista.application.dto.customers.CustomerResponse> customers,
            java.util.List<com.gestetner.servvista.application.dto.catalog.DealerResponse> dealers,
            java.util.List<com.gestetner.servvista.application.dto.catalog.RepResponse> representatives,
            java.util.List<com.gestetner.servvista.application.dto.identity.TechnicianUserResponse> technicians,
            java.util.List<com.gestetner.servvista.application.dto.catalog.ManufacturerResponse> manufacturers,
            java.util.List<com.gestetner.servvista.application.dto.catalog.MachineTypeResponse> machineTypes,
            java.util.List<com.gestetner.servvista.application.dto.identity.SalesmanUserResponse> salesmen) {}
}
