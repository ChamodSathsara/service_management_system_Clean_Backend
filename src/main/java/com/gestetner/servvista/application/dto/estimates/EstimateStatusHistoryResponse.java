package com.gestetner.servvista.application.dto.estimates;
import com.gestetner.servvista.domain.Enums.Estimates.EstimateStatus;
import java.time.LocalDateTime;
public record EstimateStatusHistoryResponse(Long historyId, EstimateStatus previousStatus,
                                            EstimateStatus newStatus, Long changedBy,
                                            LocalDateTime changedAt, String reason) {}
