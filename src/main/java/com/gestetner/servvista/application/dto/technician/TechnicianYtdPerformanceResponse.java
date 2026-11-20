package com.gestetner.servvista.application.dto.technician;

public record TechnicianYtdPerformanceResponse(
        int year,
        PerformanceMetricResponse installationJobs,
        PerformanceMetricResponse breakdownJobs,
        PerformanceMetricResponse serviceVisits
) {
}
