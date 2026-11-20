package com.gestetner.servvista.application.dto.technician;

public record PerformanceMetricResponse(
        long allJobs,
        long cancelledJobs,
        long eligibleJobs,
        long completedJobs,
        double percentage
) {
}
