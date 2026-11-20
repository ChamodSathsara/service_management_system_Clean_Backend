package com.gestetner.servvista.application.dto.technician;

import com.gestetner.servvista.application.dto.breakdowns.BreakdownResponse;
import com.gestetner.servvista.application.dto.installations.InstallationJobResponse;
import com.gestetner.servvista.application.dto.services.ServiceScheduleResponse;

import java.util.List;

public record TechnicianOpenWorkResponse(
        List<InstallationJobResponse> installationJobs,
        List<BreakdownResponse> breakdownJobs,
        List<ServiceScheduleResponse> serviceVisits
) {
}
