package com.gestetner.servvista.application.dto.estimates;
import com.gestetner.servvista.domain.Enums.Estimates.EstimateLineStatus;
import java.time.LocalDateTime;
public record EstimateLineResponse(Long estimateLineId, Long partId, String partCode,
                                   String pendingPartName, Integer qty, String note,
                                   EstimateLineStatus lineStatus, Long resolvedBy,
                                   LocalDateTime resolvedAt) {}
