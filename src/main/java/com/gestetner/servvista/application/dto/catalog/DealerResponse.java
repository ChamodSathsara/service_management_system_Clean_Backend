package com.gestetner.servvista.application.dto.catalog;

import java.time.LocalDateTime;

public record DealerResponse(Long dealerId, String dealerName, String dealerAddress,
                             String dealerContactNumber, Boolean isActive,
                             LocalDateTime createdAt, Long createdBy) {

}
